package com.company;

public class InitialsOfName {

    public static String solution(String name, String surname, int age) {

        String returnString = new String();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(name.substring(0,2));
        stringBuilder.append(surname.substring(0,2));
        stringBuilder.append(Integer.toString(age));

        returnString = stringBuilder.toString();

        return returnString;

    }
}
