package com.Section5;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        // The switch statement can have a number of possible execution paths.
        // A switch works with the byte, short, char, and int primitive data types.
        // It also works with enumerated types, the String class, and a few special classes that wrap certain
        // primitive types: Character, Byte, Short, and Integer

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or a 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        System.out.println("===============================================");

        char charValue = 'Q';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + "was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;

        }


    }
}
