package nikiforov;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static utils.RandomUtils.*;



public class RegistrationTestDataTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    String randomFirstName = faker.name().firstName(),
            randomLastName = faker.name().lastName(),
            randomEmail = faker.internet().emailAddress(),
            randomGender = getRandomGender(),
            randomPhoneNumber = faker.phoneNumber().subscriberNumber(10),
            randomDay = getRandomDay(),
            randomMonth = getRandomMonth(),
            randomYear = getRandomYear(),
            randomSubjects = getRandomSubject(),
            randomHobbies = getRandomHobbie(),
            randomAddress = faker.address().fullAddress();

//            randomState = getRandomState();



    @Test
    void successfulRegistrationFormTest() {
        registrationPage.openPage()
                .setFirstName(randomFirstName)
                .setLastName(randomLastName)
                .setEmail(randomEmail)
                .setGender(randomGender)
                .setPhoneNumber(randomPhoneNumber)
                .setDateOfBirth(randomDay,randomMonth,randomYear)
                .setSubject(randomSubjects)
                .choseHobbies(randomHobbies)
                .loadImage("image.jpg")
                .setAddress(randomAddress)
                .choseState("NCR")
                .choseCity("Delhi")
                .pressSubmit();

        registrationPage.checkRegistrationResult ("Student Name", randomFirstName)
                .checkRegistrationResult("Student Email", randomEmail)
                .checkRegistrationResult("Gender",randomGender)
                .checkRegistrationResult("Mobile",randomPhoneNumber)
                .checkRegistrationResult("Date of Birth",randomMonth)
                .checkRegistrationResult("Subjects",randomSubjects)
                .checkRegistrationResult("Hobbies",randomHobbies)
                .checkRegistrationResult("Picture","image.jpg")
                .checkRegistrationResult("Address",randomAddress)
                .checkRegistrationResult("State and City","NCR Delhi");
    }

    @Test
    void minimumValuesRegistrationFormTest() {
        registrationPage.openPage()
                .setFirstName(randomFirstName)
                .setLastName(randomLastName)
                .setGender(randomGender)
                .setPhoneNumber(randomPhoneNumber)
                .pressSubmit();

        registrationPage.checkRegistrationResult("Student Name", randomFirstName)
                .checkRegistrationResult("Gender",randomGender)
                .checkRegistrationResult("Mobile",randomPhoneNumber);
    }

    @Test
    void unsuccessfulRegistrationFormTest() {
        registrationPage.openPage()
                .setFirstName(randomFirstName)
                .setLastName(randomLastName)
                .setGender(randomGender)
                .setPhoneNumber("")
                .pressSubmit();

        registrationPage.checkoutWindow();
    }
}