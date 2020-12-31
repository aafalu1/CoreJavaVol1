package com.basandhya.core.java.controlflow.examples;

public class WhileLoopDemo2 {
    public static void main(String[] args) {

        int someValue=4;
        int factorial=1;
        while(someValue>1){
            factorial*=someValue;
            System.out.println(factorial);
            someValue--;
        }
        System.out.println(factorial);
    }
}
