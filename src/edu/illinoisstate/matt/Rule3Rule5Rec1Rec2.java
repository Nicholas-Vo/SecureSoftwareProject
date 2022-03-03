package edu.illinoisstate.matt;

import java.util.Calendar;
import java.util.Scanner;

public class Rule3Rule5Rec1Rec2 {

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String studentID;

        public Student(String firstName, String lastName, int age, String studentID) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.studentID = studentID;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }


        public boolean equals(Student other) {
            if (other == null)
                throw new NullPointerException();
            boolean flag = this.studentID.equals(other.getStudentID());

            if (flag == true)
                System.out.println("These students are the same.");
            else
                System.out.println("These students are not the same.");
            return flag;
        }

        public boolean isUnderTwentyOne(Student student) {
            if (student.equals(null))
                throw new RuntimeException("Null Student");
            if (student.age < 21)
                System.out.println("Student is under 21 years old.");
            if (student.age >= 21)
                System.out.println("Student is over 21 years old.");
            return true;
        }

        public String toString() {
            return this.firstName + " " + this.lastName + ", " + this.age + " years old ";
        }
    }

    public static class StudentApp {

        public static void main(String[] args) {


            Calendar calendar = Calendar.getInstance();
            System.out.println("Today's date and time is: " + calendar.getTime());

            Student Matthew = new Student("Matthew", "Weisbaum", 20, "801749883");
            Student Logan = new Student("Logan", "Honts", 21, "801749884");
            Student Nick = new Student("Nick", "Voss", 21, "801749885");

            Scanner scan = new Scanner(System.in);

            Matthew.equals(Nick);
        }

    }
}
