package javaclasses;

import javaclasses.abiturientdata.Abiturient;
import javaclasses.abiturientdata.Address;
import javaclasses.abiturientdata.Grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static javaclasses.Main.showTableCaption;

public class SelectionCommittee {
    private ArrayList<Abiturient> abiturients;

    public SelectionCommittee(){
        this.abiturients = new ArrayList<>();
    }
    public SelectionCommittee(ArrayList<Abiturient> abiturients){
        this.abiturients = abiturients;
    }

    public SelectionCommittee sortByTotalGrade() {
        Collections.sort(abiturients, new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                return (int)(o2.getGrades().getTotalGrade() - o1.getGrades().getTotalGrade());
            }
        });
        return this;
    }

    public void showAbiturientsWithUnsatisfactoryGrades(){
        System.out.println("\nList of abiturients with unsatisfactory grades (Diploma avg. < " + UnsatisfactoryMarks.DIPLOMA.getMark() +
                ", 1st CT subject < " + UnsatisfactoryMarks.FIRST_SUBJECT.getMark() + ", 2nd CT subject < " + UnsatisfactoryMarks.SECOND_SUBJECT.getMark() +
                ", lang CT subject < " + UnsatisfactoryMarks.LANGUAGE_SUBJECT.getMark() + ":\n");
        showTableCaption();

        for (int i=0; i < abiturients.size(); i++){
            if ((abiturients.get(i).getGrades().getDiplomaGPA() < UnsatisfactoryMarks.DIPLOMA.getMark())
                    ||(abiturients.get(i).getGrades().getFirstSubjectMark() < UnsatisfactoryMarks.FIRST_SUBJECT.getMark())
                    ||(abiturients.get(i).getGrades().getSecondSubjectMark() < UnsatisfactoryMarks.SECOND_SUBJECT.getMark())
                    ||(abiturients.get(i).getGrades().getLanguageSubjectMark() < UnsatisfactoryMarks.LANGUAGE_SUBJECT.getMark())){
                System.out.println(abiturients.get(i).toString());
            }
        }
        System.out.println();
    }


    public void showAbiturientsWithSpecifiedGradesAmount(int specifiedSum){
        System.out.println("List of abiturients whose grades amount is higher than " + specifiedSum +":\n");
        showTableCaption();

        for (int i=0; i<abiturients.size(); i++){
            if (abiturients.get(i).getGrades().getTotalGrade() > specifiedSum){
                System.out.println(abiturients.get(i).toString());
            }
        }
        System.out.println();
    }

    public void showAbiturientsWithHighestGradesAmount(int abiturientsAmount){
        System.out.println("List of " + abiturientsAmount + " abiturients having the highest grades amount:\n");
        showTableCaption();
        ArrayList<Abiturient> abiturientListSortedByGrade = sortByTotalGrade().abiturients;
        for(int i = 0; i < abiturientsAmount; i++){
            System.out.println(abiturientListSortedByGrade.get(i));
        }

        System.out.println("\nList of abiturients having a semi-pass amount:\n");
        showTableCaption();
        for(int i = abiturientsAmount; i < abiturientListSortedByGrade.size(); i++){
            if(abiturientListSortedByGrade.get(abiturientsAmount-1).getGrades().getTotalGrade() == abiturientListSortedByGrade.get(i).getGrades().getTotalGrade()){
                System.out.println(abiturientListSortedByGrade.get(i));
            }
        }
        System.out.println();
    }

    public void initializeAbiturientList(){

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

    public ArrayList<Abiturient> getAbiturients() {
        return abiturients;
    }

    public void setAbiturients(ArrayList<Abiturient> abiturients) {
        this.abiturients = abiturients;
    }
}
