package com.se.training.generics;

import com.se.training.InterfacesAndInheritance.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by baswantdasari on 5/24/17.
 */
public class ListExample_generics {
    public static void main(String[] args) {
        List<Employee> objlist = new ArrayList();

        objlist.add(new Employee("123", "rama", "34-65-7612", "23455"));
        objlist.add(new Employee("124", "john", "34-65-7712", "23456"));
        objlist.add(new Employee("125", "ram", "34-65-7812", "23457"));
        objlist.add(new Employee("126", "don", "34-65-7912", "23458"));

        System.out.println("Size before " + objlist.size());
        Iterator iterator = objlist.iterator();

        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if(employee.getEname().equals("john")){
                iterator.remove();
            }
            else {
                System.out.println(" eno are " + employee.getEno());
                System.out.println(" ename are " + employee.getEname());
                System.out.println("ssn are " + employee.getSsn());
                System.out.println("itin are " + employee.getItin());
            }
            System.out.println("Size after " + objlist.size());
        }
 // use of enhanced for loop
        /*for (Employee employee : objlist) {
            System.out.println("Eno " + employee.getEno());
            System.out.println("Ename " + employee.getEname());
            System.out.println("SSN " + employee.getSsn());
            System.out.println("itin " +employee.getItin());
        }*/
    }
}
