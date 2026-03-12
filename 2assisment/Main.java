package com.cs_is.assignment2;
abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length * width;
    }
}
public class Main{
    public static void main(String[] args) {
        Shape Circle = new Circle(4);
        Shape Rectangle = new Rectangle(5,4);
        System.out.println("Radius of Circle : " + Circle.area());
        System.out.println("Area of Rectangle : "+ Rectangle.area());
    }
}