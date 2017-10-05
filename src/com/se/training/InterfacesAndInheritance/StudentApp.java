package com.se.training.InterfacesAndInheritance;

/**
 * Created by baswantdasari on 5/22/17.
 */
public class StudentApp {

    public static void main(String[] args) {

        Student sobj1 = new Student(1, "Rama", "Maths", 1234f );

        Student sobj2 = new Student(1, "Rama", "Maths", 1234f );

        System.out.println("String form from the student " +sobj1.toString());

        if(sobj1.equals(sobj2)){
            System.out.println("both object are equal");
        }
        else{
            System.out.println("not equal");
        }

        int a = 10;

        int b = 10;

        if(a == b){
            System.out.println("both object are equal");
        }
        else{
            System.out.println("not equal");
        }

        String c = new String("Rama");

        String d = new String("Rama");

        if(c.equals(d)){
            System.out.println("both object are equal");
        }
        else{
            System.out.println("not equal");
        }





    }
}
