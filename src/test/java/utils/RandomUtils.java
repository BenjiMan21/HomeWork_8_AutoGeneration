package utils;


import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    static Faker faker = new Faker();

    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomGender() {

    return faker.options().option("Male",
            "Female",
            "Other");
}

//    public static String getRandomPhone() {
//        return String.format("%s %s %s %s %s", getRandomInt(1, 9), getRandomInt(111, 999),
//                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
//    }

    public static String getRandomDay() {
        return String.valueOf(getRandomInt(1, 28));

    }

    public static String getRandomMonth() {

    return faker.options().option("January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December");
}

    public static String getRandomYear() {
       return String.valueOf(getRandomInt(1924, 2024));

    }

    public static String getRandomSubject() {

    return faker.options().option("Maths",
            "History",
            "English",
            "Arts",
            "Computer Science",
            "Physics");
}

    public static String getRandomHobbie() {

    return faker.options().option("Sports",
            "Reading",
            "Music");
}

    public static String getRandomState() {

    return faker.options().option("NCR",
            "Uttar Pradesh",
            "Haryana",
            "Rajasthan");
    }

    public static String getRandomCity(String state){

        switch (state) {
            case "NCR":
                return faker.options().option("Delhi","Gurgaon","Noida");
            case "Uttar Pradesh":
                return faker.options().option("Agra","Lucknow","Merrut");
            case "Haryana":
                return faker.options().option("Karnal","Panipat");
            case "Rajasthan":
                return faker.options().option("Jaipur","Jaiselmer");

        }
        return state;
    }

}