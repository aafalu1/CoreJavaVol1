package com.basandhya.core.java.string.examples;

public class StringsCompareTOMethod {

    public static void main(String[] args) {
        /*

         used for comparing two strings lexicographically.
         Each character of both the strings is converted into
         a Unicode value for comparison.
         If both the strings are equal
         then this method returns 0 else
         it returns positive or negative value.
         The result is positive if the first string is lexicographically greater
         than the second string else the result would be negative */

        String firString="Khakis";
        String secString="Cotton";
        String thirdString="Khakis";

//        if(firString.compareTo(secString)<0){
//            System.out.println("unicode value of " +firString + "is less than "+secString);
//        }else if(firString.compareTo(secString)>0){
//            System.out.println("unicode value of " +firString + " is greater than  "+secString);// true
//        }else if(firString.compareTo(secString)==0){
//            System.out.println("unicode value of " +firString + " is equals to "+secString);
//        }

        if(firString.compareTo(thirdString)==0){
            System.out.println("the Unicode value of "+firString+ " is equal to "+ thirdString);//true
        }else{
            System.out.println("the Unicode value of "+firString+ " is not equal to "+ thirdString);
        }
    }
}
