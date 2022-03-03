package edu.illinoisstate.robert.rules;

public class Rule1 {

    static class VerifyGrade {
        private float gr; // initial grade

        //putting in the grade
        float puttingGrade(int gr) {
            this.gr += gr;
            return this.gr;
        }

        public static void main(String[] args) {
            VerifyGrade obj = new VerifyGrade();
            System.out.println(obj.puttingGrade(90));
        }
    }

// type in java -Xverify:all VerifyGrade to print out the grade

}
