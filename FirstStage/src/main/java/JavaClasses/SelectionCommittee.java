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

    public ArrayList<Abiturient> getAbiturients() {
        return abiturients;
    }

    public void setAbiturients(ArrayList<Abiturient> abiturients) {
        this.abiturients = abiturients;
    }
}
