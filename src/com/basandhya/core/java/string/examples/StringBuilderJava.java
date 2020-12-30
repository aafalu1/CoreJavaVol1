package com.basandhya.core.java.string.examples;

public class StringBuilderJava {

    public static void main(String[] args) {
        String str = "Basanta";
        int age = 25;
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, my name is");
        sb.append(": ");
        sb.append(str);
        sb.append(" and I am ");
        sb.append(age);
        sb.append(" years old.");
        String buildString = sb.toString();
        System.out.println(buildString);
// Hello, my name is: Basanta and I am 25 years old.
    }
}
