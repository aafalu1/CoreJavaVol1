package com.basandhya.core.java.controlflow.examples;

public class IfEleseDemo1 {



    public static void main(String[] args) {
        int yearSales=1600;
        int targetSales=1700;
        double bonus =0.0;
        boolean satisfactory=false;
   if(yearSales>=targetSales){
       bonus =(yearSales-targetSales)*(1.01);
       satisfactory=true;
       System.out.println("Your performace is outsanding : "+ ", you are receiving extra bonus of Rs: "+ bonus);

   }else{
       bonus=0.00;
       satisfactory=false;
       System.out.println("Your performace is below than average "+ ", you are not receiving extra bonus this year: " +bonus);
   }

    }



}
