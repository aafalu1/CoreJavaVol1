package com.basandhya.core.java.string.examples;

import java.util.Scanner;

public class ReadingInputOutput {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("What is your Name ? ");
        String name=scanner.nextLine();
        System.out.print("What is your age ?");
          int myAge=scanner.nextInt();
        System.out.println("My name is "+name + " , and "+ "I am "+myAge +" years old");
        //My name is Basanta , and I am 25 years old
    }
}
