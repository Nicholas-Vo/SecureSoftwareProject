package edu.illinoisstate.logan;

import java.util.Scanner;

public class Rule1Rule2 {

    /**
     * Logan Honts
     * IT 355
     * Java rules combined code
     */
    public static class Combined {
        Scanner userIn = new Scanner(System.in);

        /**
         * This method combines Rule 1: NUM02-J. Ensure that division and remainder
         * operations do not result in divide-by-zero errors AND Rule 2: NUM09-J. Do
         * not use floating-point variables as loop counters
         */
        public void Comb1() {
            int counter = 1;
            float num1, result;

            System.out.print("Enter a number: ");
            num1 = userIn.nextFloat();

            /*
             * Here I use regular int values for the loop counter
             * And then convert the value INSIDE the loop
             */
            for (counter = 1; counter <= 20; counter += 1) {

                /*
                 * This is where the conversion happens using the users float input!
                 */
                result = counter / num1;

                /*
                 * Here I check to make sure the second number is not zero
                 */
                if (num1 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result is: " + result);
                }
            }
        }
    }

    /**
     * Class to run program
     */
    static class RunCombined {
        public static void main(String[] args) {

            /*
             * Creating object to call methods
             */
            Combined recObj = new Combined();

            System.out.println("Combined Rule 1 and 3!");
            recObj.Comb1();
            System.out.println();
        }
    }

}
