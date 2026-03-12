package com.cs_is.assignment2;


final class FinalClass {
    void showMessage(){
        System.out.println("This is a final class");
    }
}

class Parent{
    final int x = 10;
    final void display(){
        System.out.println("This is the final variable : "+x);
        System.out.println("This is the final method");
    }
}

public class FinalEx {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.showMessage();
        Parent p = new Parent();
        p.display();
    }
}
