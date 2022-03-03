package edu.illinoisstate.logan;

/*
 * Logan Honts
 * IT355
 * Non-compliant Recommendations class
 */
public class NonCompliantRecommendations {

    /**
     * Class for non-compliant recommendations
     */
    public static class NonRecommendations {
        /**
         * Recommendation 1: EXP52-J. Use braces for the body of
         * an if, for, or while statement
         */
        public void NonRec1() {
            int basicNum = 743;

            if (basicNum >= 1 && basicNum < 100)
                System.out.println("The number is two digits!");
            else if (basicNum >= 100 && basicNum < 1000)
                System.out.println("The number is three digits!");
            else if (basicNum >= 1000 && basicNum < 10000)
                System.out.println("The number is four digits!");
            else
                System.out.println("The number is not between 1 & 9999");

        }

        /**
         * Recommendation 2: EXP53-J. Use parentheses for precedence of operation
         */
        public void NonRec2() {
            int opNum1 = 15;
            int opNum2 = 4;
            int opNum3 = 10;

            /*
             * Here I do not use parenthesis in the expression so the program does not know
             * what to evaluate first. Ending up with unpredictable results
             */
            System.out.println(opNum1 ^ opNum2 + opNum3);

        }

        /**
         * Recommendation 3: EXP54-J. Understand the differences between
         * bitwise and logical operators
         */
        public void NonRec3() {
            int[] myArray = new int[1];
            int i = 0;

            /*
             * Using & instead of && will throw either a NullPointerException
             * or ArrayIndexOutOfBoundsException because it will run through every
             * condition even if one fails
             */
            if (i < myArray.length & myArray[i] >= 0 & myArray != null & i >= 0) {
                System.out.println("Valid Array!");

            } else {
                System.out.println("Error, array may be invalid!");
            }
        }

        /**
         * Recommendation 4: NUM50-J. Convert integers to floating point for
         * floating-point operations
         */
        public void NonRec4() {
            int convNum1 = 255;
            long convNum2 = 99999999999L;

            /*
             * Not converting the new float and double variables
             * will cause the values to be truncated or allow
             * integer overflow to occur
             */
            float flNum = convNum1 / 4;
            double dbNum = convNum2 / 555;

            System.out.println(flNum);
            System.out.println(dbNum);
        }

    }

    /**
     * Class to run program
     */
    static class RunNonRec {
        public static void main(String[] args) {
            /*
             * Creating object to call methods
             */
            NonRecommendations recObj = new NonRecommendations();

            System.out.println("Non-Complient Recommendation 1!");
            recObj.NonRec1();
            System.out.println();

            System.out.println("Non-Complient Recommendation 2!");
            recObj.NonRec2();
            System.out.println();

            System.out.println("Non-Complient Recommendation 3!");
            recObj.NonRec3();
            System.out.println();

            System.out.println("Non-Complient Recommendation 4!");
            recObj.NonRec4();
        }
    }

}
