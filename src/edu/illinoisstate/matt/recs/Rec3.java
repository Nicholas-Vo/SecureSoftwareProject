package edu.illinoisstate.matt.recs;

public class Rec3 {


//     public static String display(Circle c) {
//         return "Circle";
//     }
//     public static String display(Triangle t) {
//         return "Triangle";
//     }
//     public static String display(Rectangle r) {
//         return "Rectangle";
//     }
//     public static String display(Shape s) {
//         return "Shape";
//     }


    public static String display(Shape shape) {
        if (shape instanceof Circle) {
            return "Circle";
        } else if (shape instanceof Triangle) {
            return "Triangle";
        } else if (shape instanceof Rectangle) {
            return "Rectangle";
        }
        return "Shape";
    }

    static class Shape {
    }

    static class Circle extends Shape {
    }

    static class Triangle extends Shape {
    }

    static class Rectangle extends Shape {
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Shape s = new Shape();

        System.out.println(display(c));
        System.out.println(display(t));
        System.out.println(display(r));
        System.out.println(display(s));
    }


}
