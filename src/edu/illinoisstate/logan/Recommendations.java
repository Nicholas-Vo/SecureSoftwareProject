package edu.illinoisstate.logan;

/*
 * Logan Honts
 * IT355
 * Compliant Recommendations class
 */
public class Recommendations {
    /**
     * Recommendation 1: EXP52-J. Use braces for the body of
     * an if, for, or while statement
     */
    public void Rec1() {
        int basicNum = 743;

        /*
         * Encasing the loop body with braces allows for better consistency and code readability
         */
        if (basicNum >= 1 && basicNum < 100) {
            System.out.println("The number is two digits!");
        } else if (basicNum >= 100 && basicNum < 1000) {
            System.out.println("The number is three digits!");
        } else if (basicNum >= 1000 && basicNum < 10000) {
            System.out.println("The number is four digits!");
        } else {
            System.out.println("The number is not between 1 & 9999");
        }

    }

    /**
     * Recommendation 2: EXP53-J. Use parentheses for precedence of operation
     */
    public void Rec2() {

        int opNum1 = 15;
        int opNum2 = 4;
        int opNum3 = 10;
        /*
         * The use of parenthesis here allows the program to understand
         * how the expression should be evaluated
         */
        System.out.println((opNum1 ^ opNum2) + opNum3);
    }

    /**
     * Recommendation 3: EXP54-J. Understand the differences between
     * bitwise and logical operators
     */
    public void Rec3() {
        int[] myArray = new int[1];
        int i = 0;

        /*
         * Using the && here allows the if statement to run through its conditions one-by-one
         * and if any fail then it does NOT iterate through the rest
         */
        if (i < myArray.length && myArray[i] >= 0 && myArray != null && i >= 0) {
            System.out.println("Valid Array!");

        } else {
            System.out.println("Error, array may be invalid!");
        }
    }

    /**
     * Recommendaiton 4: NUM50-J. Convert integers to floating point for
     * floating-point operations
     */
    public void Rec4() {

        int convNum1 = 255;
        long convNum2 = 99999999999L;

        /*
         * Here I convert the integer values to floating-point values before I
         * do a floating-point operation. Thus I will have accurate results
         */

        float flNum = convNum1 / 4.0f;
        double dbNum = convNum2 / 555.;

        System.out.println(flNum);
        System.out.println(dbNum);
    }


}

/**
 * Class to run program
 */
class RunRec {
    public static void main(String[] args) {
        /*
         * Creating object to call methods
         */
        Recommendations recObj = new Recommendations();

        System.out.println("Complient Recommendation 1!");
        recObj.Rec1();
        System.out.println("");

        System.out.println("Complient Recommendation 2!");
        recObj.Rec2();
        System.out.println("");

        System.out.println("Complient Recommendation 3!");
        recObj.Rec3();
        System.out.println("");

        System.out.println("Complient Recommendation 4!");
        recObj.Rec4();
    }
}

