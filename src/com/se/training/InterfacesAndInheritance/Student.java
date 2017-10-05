package com.se.training.InterfacesAndInheritance;

/**
 * Created by baswantdasari on 5/22/17.
 */
public class Student implements Comparable {

    private int sno;

    private String sname;

    private String course;

    private float fee;


    public Student(int sno, String sname, String course, float fee) {
        this.sno = sno;
        this.sname = sname;
        this.course = course;
        this.fee = fee;
    }

    public Student() {
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", course='" + course + '\'' +
                ", fee=" + fee +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student){

            Student stu = (Student) obj;

            if(this.sno == stu.getSno() && this.sname.equals(stu.getSname()))

            return true;
        }
        return false;


    }

    @Override
    public int hashCode() {

        return this.sno + this.sname.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
