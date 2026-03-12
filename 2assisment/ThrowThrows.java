package com.cs_is.assignment2;


public class ThrowThrows {
    static void test()throws Throwable{
        throw new Throwable("Something wrong");
    }

    public static void main(String[] args) {
        try{
            test();
        }catch(Throwable t){
            System.out.println("Handled : " +t);
            System.out.println("Handled : "+t.getMessage());
        }
    }
}
