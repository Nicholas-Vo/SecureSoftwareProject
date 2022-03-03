package edu.illinoisstate.logan;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Rule1ThroughFive {

    /*
     * Logan Honts
     * IT355
     * Compliant Rules class
     */

    /**
     * Class for compliant rules
     */
    public static class CompliantRules {
        Scanner userIn = new Scanner(System.in);

        /**
         * Rule 1: NUM02-J. Ensure that division and remainder
         * operations do not result in divide-by-zero errors
         */
        public void Rule1() {
            double num1, num2, result;

            System.out.print("Enter number 1: ");
            num1 = userIn.nextInt();

            System.out.print("Enter number 2: ");
            num2 = userIn.nextInt();

            /*
             * Here I check to make sure the second number is not zero
             */
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");

            } else {

                result = num1 / num2;
                System.out.println("Result is: " + result);
            }
        }


        /**
         * Rule 2: NUM09-J. Do not use floating-point variables as loop counters
         */
        public void Rule2() {
            int counter = 1;

            /*
             * Here I use regular int values for the loop counter
             * And then convert the value INSIDE the loop
             */
            for (counter = 1; counter <= 20; counter += 1) {
                float result = counter / 10.0f;

                System.out.println(result);
            }

        }

        /**
         * Rule 3: NUM10-J. Do not construct BigDecimal objects
         * from floating-point literals
         */
        public void Rule3() {
            /*
             * Applying parenthesis to ensure BigDecimal can accurately
             * respresent the floating-point value
             */
            System.out.println(new BigDecimal("6.9"));
        }

        /**
         * Rule 4: EXP02-J. Do not use the Object.equals() method to compare two arrays
         */
        public void Rule4() {

            String[] fruits = {"Apple", "Banana", "Strawberry"};
            String[] veggies = {"Carrot", "Broccoli", "Cucumber"};

            /*
             * Prints false as fruits != veggies
             */
            System.out.println(Arrays.equals(fruits, veggies));

            String[] fruits2 = {"Apple", "Banana", "Strawberry"};

            /*
             * Prints true as fruits = fruits2
             */
            System.out.println(Arrays.equals(fruits, fruits2));
        }


        /**
         * Rule 5: NUM08-J. Check floating-point inputs for exceptional values
         */
        public void Rule5() {
            double currentBalance = 5000.0;

            System.out.println("Current balance is: " + currentBalance);
            System.out.println("How much would you like to withdrawal? (integer) ");

            double val = userIn.nextInt();

            /*
             * Here I check for infinity as an input
             */
            if (Double.isInfinite(val)) {
                System.out.println("Cannot input infinity");
            }

            /*
             * Here I check for a NaN
             */
            if (Double.isNaN(val)) {
                System.out.println("Input is Not a Number");
            }

            if (val > currentBalance) {
                System.out.println("Insufficient funds");
            } else {
                currentBalance -= val;
                System.out.println("New balance is: " + currentBalance);
            }
        }
    }


    /**
     * Class to run program
     */
    static class RunRules {
        public static void main(String[] args) {
            /*
             * Creating object to call methods
             */
            CompliantRules ruleObj = new CompliantRules();

            System.out.println("Compliant Rule 1!");
            ruleObj.Rule1();
            System.out.println();

            System.out.println("Compliant Rule 2!");
            ruleObj.Rule2();
            System.out.println();

            System.out.println("Compliant Rule 3!");
            ruleObj.Rule3();
            System.out.println();

            System.out.println("Compliant Rule 4!");
            ruleObj.Rule4();
            System.out.println();

            System.out.println("Compliant Rule 5!");
            ruleObj.Rule5();
            System.out.println();

        }
    }


}
