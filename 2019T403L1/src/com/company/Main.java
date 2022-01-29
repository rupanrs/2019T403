package com.company;

import java.util.ArrayList;

public class Main {

    static String name = "rupan rs";
    public static final int serialNum= 10;
    boolean isActive = false;

   private static boolean isOddNumber(int input) {
       return (input % 2) == 1;

   }

    public static void main(String[] args) {
       /*
	/* write your code here
        System.out.println("Hello Everyone");
        System.out.println("Name:" +name);

        int valA = 10;
        double valB= (double) valA;

        int valC= valA/(int) 2.5;
        System.out.print("valC="+valC);

        String myName= "RUPAN SUTHAR";
        System.out.println("\n" +myName);

        //user param
        int age= 23;
        if (age<18){
            System.out.println("Not eligible for a driving license");
        }
        else if(age>80){
            System.out.println("Too Old, Submit your medical certificate");
        }
        else {
            System.out.println("Allowed to Apply");
        }

        switch (age){
            case 80:

        } */

/*
        int x = 0;
        int y = 0;

        System.out.print("X=" + x++ + "\n");
        System.out.print("Y=" + ++y +"\n");

        int xx = 23;
        if (xx % 2 == 0) {
            System.out.print("even");
        } else {
            System.out.print("Odd");
        }



        if (isOddNumber(xx))
            System.out.print("Odd Number \n");
        else System.out.print("Even No \n");


        ArrayList<String>names=new ArrayList<String>();
        names.add("rupan \n");
        names.add("yathu \n");
        names.add("mau");
        names.add("jine");

        int c=0;
        boolean isTrue=false;

        for (int cc=0; cc<names.size(); cc++){
            System.out.print(names.get(cc));
            if (cc==2)
                break;
        }
        /*
        while (c < names.size()) {
            System.out.print(names.get(c));

            System.out.print(names.get(c));
            System.out.print();
            c++;

            if (){
                isTrue
            }
        }*/

    Vehicle vehicle=new Vehicle();
    String.out.print("Lisense No" + vehicle.getLicenseNo());


    }
}
