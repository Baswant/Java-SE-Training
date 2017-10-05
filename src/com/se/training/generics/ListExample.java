package com.se.training.generics;

import com.se.training.InterfacesAndInheritance.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by baswantdasari on 5/24/17.
 */
public class ListExample {

    public static void main(String[] args) {

        List objlist = new ArrayList();

        Integer a = 123 ;

        String b ="Rama";

        Employee employee = new Employee("123" ,"Rama", "861-56-5611", "12343");

        objlist.add(a);
        objlist.add(b);
        objlist.add(employee);

        //System.out.println(" The second element :-" +objlist.get(1)); not a good process for collections.
        Iterator iterator = objlist.iterator(); // Iterator is used to retrive the data

        while (iterator.hasNext()){
            //System.out.println("data stored in objlist is "  +iterator.next()); // to get everything

            Object obj = iterator.next();
            if(obj instanceof String){
                System.out.println("String data stored in objlist is "  +(String) obj);
            }
            else if( obj instanceof Integer){
                System.out.println("Interger data stored in objlist is "  +(Integer)obj);
            }
            else {
                System.out.println("Employee data stored in objlist is "  +(Employee)obj);
            }
        }



    }













}
