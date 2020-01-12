package main.java.JavaClasses;

public class Grades {
    private double diplomaGPA;
    private int firstSubjectMark;
    private int secondSubjectMark;
    private int languageSubjectMark;
    private double totalGrade;


    public Grades(double diplomaGPA, int firstSubjectMark, int languageSubjectMark) {
        this.diplomaGPA = diplomaGPA;
        this.firstSubjectMark = firstSubjectMark;
        this.languageSubjectMark = languageSubjectMark;
    }

    public Grades(double diplomaGPA, int firstSubjectMark, int secondSubjectMark, int languageSubjectMark){
        this(diplomaGPA,firstSubjectMark,languageSubjectMark);
        this.secondSubjectMark = secondSubjectMark;
        this.totalGrade = (diplomaGPA*10) + firstSubjectMark + secondSubjectMark + languageSubjectMark;
    }

    public void setDiplomaGPA(double diplomaGPA) {
        this.diplomaGPA = diplomaGPA;
    }

    public double getDiplomaGPA() {
        return diplomaGPA;
    }

    public void setFirstSubjectMark(int firstSubjectMark) {
        this.firstSubjectMark = firstSubjectMark;
    }

    public int getFirstSubjectMark() {
        return firstSubjectMark;
    }

    public void setLanguageSubjectMark(int languageSubjectMark) {
        this.languageSubjectMark = languageSubjectMark;
    }

    public int getLanguageSubjectMark() {
        return languageSubjectMark;
    }

    public void setSecondSubjectMark(int secondSubjectMark) {
        this.secondSubjectMark = secondSubjectMark;
    }

    public int getSecondSubjectMark() {
        return secondSubjectMark;
    }

    public double getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(double totalCost) {
        this.totalGrade = totalCost;
    }
}
