package javaclasses;

import javaclasses.abiturientdata.Abiturient;
import javaclasses.abiturientdata.Address;
import javaclasses.abiturientdata.Grades;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ){
        SelectionCommittee selectionCommittee = new SelectionCommittee();
        initializeAbiturientList(selectionCommittee.getAbiturients());

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

    public static void initializeAbiturientList(ArrayList<Abiturient> abiturients){

        abiturients.add(new Abiturient(0, "Ivanov", "Ivan", "Ivanovich",
                new Address("Minsk", 220001,"prospekt Mayakovskogo 128-12", "+375(29)123-45-67"),
                new Grades(9.8, 91, 92, 98)));
        abiturients.add(new Abiturient(1, "Schemeliov", "Evgeniy", "Maximovich",
                new Address("Brest", 231051,"Sovetskaya street 56-1", "+375(44)703-43-21"),
                new Grades(7.2, 81, 75, 91)));
        abiturients.add(new Abiturient(2, "Beliy", "Maxim", "Petrovich",
                new Address("Minsk", 220123,"prospekt Partizanskiy 102-168", "+375(29)183-66-01"),
                new Grades(3.9, 46, 22, 36)));
        abiturients.add(new Abiturient(3, "Kolcev", "Alexander", "Mihailovich",
                new Address("Mogilev", 211361,"Internacionalnaya street 28/2-14", "+375(33)723-78-24"),
                new Grades(9.4, 93, 93, 98)));
        abiturients.add(new Abiturient(4, "Zolotaya", "Anastasiya", "Sergeevna",
                new Address("Pinsk", 210801,"Lenina street 20-16", "+375(33)127-65-01"),
                new Grades(7.6, 82, 76, 91)));
        abiturients.add(new Abiturient(5, "Malceva", "Alesya", "Dmitrievna",
                new Address("Baranovichi", 234061,"Partizanskaya street 65-15", "+375(29)783-01-63"),
                new Grades(4.5, 43, 46, 19)));
        abiturients.add(new Abiturient(6, "Ivanova", "Alexandra", "Sergeevna",
                new Address("Minsk", 220107,"Vasnecova street 17-2", "+375(29)605-25-87"),
                new Grades(9.4, 86, 92, 90)));
        abiturients.add(new Abiturient(7, "Markina", "Mariya", "Artemovna",
                new Address("Lida", 223563,"Pobeda street 10-2", "+375(44)168-42-34"),
                new Grades(8.2, 91, 80, 82)));
        abiturients.add(new Abiturient(8, "Parilov", "Grigoriy", "Vladimirovich",
                new Address("Brest", 231051,"8 iulya street 2-12", "+375(29)802-53-92"),
                new Grades(9.7, 92, 92, 98)));
        abiturients.add(new Abiturient(9, "Gorilova", "Anya", "Alexeevna",
                new Address("Minsk", 220107,"prospekt Pobediteley 108-22", "+375(33)167-43-62"),
                new Grades(9.6, 91, 94, 98)));
    }

}
