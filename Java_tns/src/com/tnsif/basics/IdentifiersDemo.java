package com.tnsif.basics;

public class IdentifiersDemo {

    public static void main(String[] args) {

        // Invalid identifier examples (commented)
        // int for = 13;     // keyword cannot be identifier
        // int number 2 = 13; // space not allowed
        // int @number = 10;  // cannot start with special symbol

        // Valid identifier examples
        int number = 20;          // starts with letter
        System.out.println("value of the number variable is : " + number);

        String studentName = "Aniket";   // camelCase
        System.out.println("value is : " + studentName);
    }
}
