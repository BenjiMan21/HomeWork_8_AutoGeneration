package utils;


import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomGender() {
        String[] genders = {
                "Male",
                "Female",
                "Other"
        };
        int index = getRandomInt(0, genders.length - 1);

        return genders[index];
    }

//    public static String getRandomPhone() {
//        return String.format("%s %s %s %s %s", getRandomInt(1, 9), getRandomInt(111, 999),
//                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
//    }

    public static String getRandomDay() {
        return String.valueOf(getRandomInt(1, 31));

    }

    public static String getRandomMonth() {
        String[] months = {
                "January",
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
                "December"
        };
        int index = getRandomInt(0, months.length - 1);

        return months[index];
    }

    public static String getRandomYear() {
       return String.valueOf(getRandomInt(1924, 2024));

    }

    public static String getRandomSubject() {
        String[] subjects = {
                "Maths",
                "History",
                "English",
                "Arts",
                "Computer Science",
                "Physics"
        };
        int index = getRandomInt(0, subjects.length - 1);

        return subjects[index];
    }

    public static String getRandomHobbie() {
        String[] hobbies = {
                "Sports",
                "Reading",
                "Music"
        };
        int index = getRandomInt(0, hobbies.length - 1);

        return hobbies[index];
    }

    public static String getRandomState() {
        String[] states = {
                "NCR",
                "Uttar Pradesh",
                "Haryana",
                "Rajasthan"
        };
        int index = getRandomInt(0, states.length - 1);

        return states[index];
    }



}
