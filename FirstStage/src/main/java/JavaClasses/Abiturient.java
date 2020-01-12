package main.java.JavaClasses;

import java.util.Comparator;

public class Abiturient {
     private final int id;
     private String lastName;
     private String firstName;
     private String middleName;
     private Address address;
     private Grades grades;

    public Abiturient(int id,
                      String lastName,
                      String firstName,
                      String middleName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Abiturient(int id,
                      String lastName,
                      String firstName,
                      String middleName,
                      Address address,
                      Grades grades){
        this(id, lastName, firstName, middleName);
        this.address = address;
        this.grades = grades;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString(){

        return String.format("%-3s%-15s%-15s%-15s%-15s%-35s%-15s%-20s%-22s%-10s%-10s%-10s%-10s", id, lastName, firstName, middleName, address.getCity(),
                address.getCityAddress(), address.getPostIndex(), address.getPhoneNumber(), grades.getTotalGrade(), grades.getDiplomaGPA(),grades.getFirstSubjectMark(),
                grades.getSecondSubjectMark(), grades.getLanguageSubjectMark());
    }


}
