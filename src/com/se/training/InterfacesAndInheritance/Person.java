package com.se.training.InterfacesAndInheritance;

/**
 * Created by baswantdasari on 5/23/17.
 */
public class Person {

    private String ssn;

    private String itin;



    public Person(String ssn, String itin) {
        this.ssn = ssn;
        this.itin = itin;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getItin() {
        return itin;
    }

    public void setItin(String itin) {
        this.itin = itin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!ssn.equals(person.ssn)) return false;
        return itin.equals(person.itin);
    }

    @Override
    public String toString() {
        return "com.corejava.oops.inheritance.Person{" +
                "ssn='" + ssn + '\'' +
                ", itin='" + itin + '\'' +
                '}';
    }
}
