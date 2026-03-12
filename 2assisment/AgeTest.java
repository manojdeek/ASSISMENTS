package com.cs_is.assignment2;

import java.util.*;

public class AgeTest {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age < 18){
            throw new Exception("You are not Eligible");
        }else{
            System.out.println("You are Eligible");
        }
    }
}
