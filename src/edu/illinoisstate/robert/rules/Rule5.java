package edu.illinoisstate.robert.rules;

public class Rule5 {

    //Rule 5 prevent class initialization cycles

    public static void main(String[] args) {
        Audi audi = new Audi();
        Car car = new Car();

        audi.audi_method();
        car.car_method();
    }


    static class Audi {
        public Audi() {
            System.out.println("Audi R8");
        }

        void audi_method() {
            System.out.println("Tesla is cool.");
        }

    }

    static class Car {
        public Car() {
            System.out.println("Cars are cool.");
        }

        void car_method() {
            System.out.println("Tesla Model S.");
        }

    }
}
