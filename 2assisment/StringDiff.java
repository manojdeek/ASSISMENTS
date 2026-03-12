package com.cs_is.assignment2;
public class StringDiff {
    public static void main(String[] args) {
        String str = "Java";
        str.concat(" Script");
        System.out.println("String after concat : "+str );

        str = str.concat(" Script");
        System.out.println("String after reassigned : "+str );

        StringBuilder str1 = new StringBuilder("Hello");
        str1.append(" World");
        System.out.println("StringBuilder append : "+str1);

        StringBuffer str2 = new StringBuffer("Hello");
        str2.append(" Nandan");
        System.out.println("StringBuffer append : "+str2);
    }
}
