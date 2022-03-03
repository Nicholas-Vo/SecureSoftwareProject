package edu.illinoisstate.robert.rules;

import java.util.Scanner;

public class Rule4 {

    //Rule 4 assertions must not produce side effects

    public static void main(String[] args) {
        int grade;
        int type;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade (0 to 100): ");
        grade = scanner.nextInt();

        type = grade / 10;
        assert !true : type;
        switch (type) {
            case 10 -> System.out.println("Perfect score!");
            case 9 -> System.out.println("Above 90 good job!");
            case 8 -> System.out.println("Above 80 good job!");
            case 7 -> System.out.println("Average. Good job.");
            case 6 -> System.out.println("Need some work.");
            case 5, 1, 2, 3, 4 -> System.out.println("Please see me.");
        }

        if (type < 0 || type > 100) {
            throw new AssertionError(type);
        }

    }

}
