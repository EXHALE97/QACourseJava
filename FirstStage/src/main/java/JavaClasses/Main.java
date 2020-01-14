package javaclasses;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ){
        SelectionCommittee selectionCommittee = new SelectionCommittee();
        selectionCommittee.initializeAbiturientList();

        while(true){
        showMenu();
        switch (in.nextInt()){
                case 1: selectionCommittee.showAbiturientsWithUnsatisfactoryGrades(); break;
                case 2: {
                    System.out.println("Enter grades sum:");
                    int specifiedSum = in.nextInt();
                    selectionCommittee.showAbiturientsWithSpecifiedGradesAmount(specifiedSum);
                }break;
                case 3: {
                    System.out.println("Enter abiturients amount:");
                    int abiturientsAmount = in.nextInt();
                    selectionCommittee.showAbiturientsWithHighestGradesAmount(abiturientsAmount);
                } break;
                case 0: System.exit(0); break;
                default: System.out.println("Error, try again!");
            }

        }
    }

    public static void showMenu(){
        System.out.println("Choose task:");
        System.out.println("1 - Show list of abiturients with unsatisfactory grades.");
        System.out.println("2 - Show list of abiturients whose grades amount is higher than the specified amount.");
        System.out.println("3 - Show list of N abiturients having the highest grades amount (also display a complete list of applicants having a semi-pass amount).");
        System.out.println("0 - Exit.");
    }

    public static void showTableCaption(){
        System.out.println(String.format("%-3s%-15s%-15s%-15s%-15s%-35s%-15s%-20s%-22s%-10s%-10s%-10s%-10s",
                "ID", "Last Name", "First Name", "Middle Name",
                "City", "Address", "Post Index", "Phone Number",
                "Total Grade (max 400)","Diploma","1st CT", "2nd CT", "Lang CT"));
    }


}
