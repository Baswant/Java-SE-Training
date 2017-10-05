package com.se.training.generics;

import com.se.training.InterfacesAndInheritance.Employee;
import com.se.training.InterfacesAndInheritance.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by baswantdasari on 5/24/17.
 */
public class ListExample_Sort {

    public static void main(String[] args) {

        List<String> objList = new ArrayList();

        objList.add("rama");
        objList.add("john");
        objList.add("don");
        objList.add("sam");
        objList.add("hendry");
        objList.add("fen");

        System.out.println(" Size of objlist before sort" + objList );

        Collections.sort(objList);

        System.out.println(" Size of objlist  after sort " + objList  );

        List<Student> studentList = new ArrayList<Student>();

        System.out.println(" Size of objlist before sort" + objList );

        studentList.add(new Student(123, "rama", "34-65-7612", 233f));
        studentList.add(new Student(124, "raj", "34-65-7613", 234f));
        studentList.add(new Student(125, "john", "34-65-7614", 235f));

        Collections.sort(studentList);

        System.out.println(" Size of objlist before sort" + studentList );

    }




}
