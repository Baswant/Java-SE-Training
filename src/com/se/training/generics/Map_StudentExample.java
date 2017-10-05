package com.se.training.generics;

import com.se.training.InterfacesAndInheritance.Student;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by baswantdasari on 5/25/17.
 */
public class Map_StudentExample {

    public static void main(String[] args) {

        Map<Student,String> studentStringMap = new Hashtable<Student,String>();

        studentStringMap.put(new Student(101,"Rama","Maths", 100f),"Rama");
        studentStringMap.put(new Student(101,"Rama","Maths", 100f),"Rama");
        studentStringMap.put(new Student(103,"Ron","Maths", 100f),"Ron");
        studentStringMap.put(new Student(104,"John","Maths", 100f),"John");

        System.out.println("Student Data" +studentStringMap);

    }
}
