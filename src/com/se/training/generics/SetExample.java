package com.se.training.generics;

import com.se.training.InterfacesAndInheritance.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by baswantdasari on 5/24/17.
 */
public class SetExample {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<String>();

        stringSet.add("rama");
        stringSet.add("john");
        stringSet.add("rama");
        stringSet.add("sam");

        System.out.println(" elements in sreingSet"  +stringSet);

        Set<Student> studentSet = new HashSet<Student>();

        studentSet.add(new Student(121,"rama","maths",123f));
        studentSet.add(new Student(122,"john","maths",124f));
        studentSet.add(new Student(123,"sam","maths",125f));
        studentSet.add(new Student(121,"rama","maths",126f));

        System.out.println("studentSet :- " +studentSet); // in order to find duplicate in hashset  need to override hashcode and equals method
    }


}
