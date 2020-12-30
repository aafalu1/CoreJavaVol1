package com.basandhya.core.java.string.examples;

public class SubStrings {

    public static void main(String[] args) {
        String greet="Hello";

        System.out.println("Sub String of greets for the index 1 is "+greet.substring(1));//ello
        System.out.println("Sub String of greets for the index 2 is "+greet.substring(2)); //llo
        System.out.println(greet.substring(0, 3));//Hel
        System.out.println(greet.subSequence(0,3));// Hel
        //System.out.println(""+ greet.substring(6));// Exception StringIndexOutOfBoundException begin6 , end 5, length 5

        /*
        calculating the length of sub string is easy
         */

        int begIndex=0;
        int endingIndex=3;
        int result =endingIndex-begIndex;
        String formatted =greet.substring(begIndex, endingIndex);
        System.out.println("formatted String : "+formatted);
        if(formatted.length()==result){
            System.out.println("calculating length becomes easy with sub string : " );
            String str="Hello, Java is a good programming language";
            char c=str.charAt(7);
            char c1=str.charAt(12);
            System.out.println(c);//j
            System.out.println(c1);//i
        }

    }

}
