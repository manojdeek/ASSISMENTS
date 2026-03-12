package com.cs_is.assignment2;

public class TryCatchFinally {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try{
            int result = x/y;
            System.out.println("Result : "+result);
        }catch(ArithmeticException e){
            System.out.println("Error : it cannot be divided by zero");
        }finally{
            System.out.println("Finally block executed");
        }
    }
}
