package com.cs_is.assignment2;
class Static {
    static String name = "Java";
    static void display(){
        System.out.println("This is a Static variable : "+name);
        System.out.println("This is a Static method");
    }
}
public class StaticEx {
    public static void main(String[] args) {
        Static s = new Static();
        s.display();
    }
}
