package com.se.training.InterfacesAndInheritance;

/**
 * Created by baswantdasari on 5/23/17.
 */
public class Employee extends Person {

    private String eno;

    private  String ename;

    public Employee(String eno, String ename, String ssn, String itin) {
        super(ssn, itin);

        System.out.println("com.corejava.oops.inheritance.Employee class construtor");

        this.eno = eno;
        this.ename = ename;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        // one way of doing
//        return "com.corejava.oops.inheritance.Employee{" +
//                "eno='" + eno + '\'' +
//                ", ename='" + ename + '\'' +
//                "sno='" + getSsn()+ '\'' + "itin='" +getItin()+ '}';
        //other way using super
        return super.toString() + "com.corejava.oops.inheritance.Employee{" +
                "eno='" + eno + '\'' +
                ", ename='" + ename + '\'' +
                '}';
    }
}
