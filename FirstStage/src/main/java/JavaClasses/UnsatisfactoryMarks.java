package javaclasses;

public enum UnsatisfactoryMarks {
    FIRST_SUBJECT(15), SECOND_SUBJECT(10), LANGUAGE_SUBJECT(20), DIPLOMA(4.0);
    private double mark;

    UnsatisfactoryMarks(double mark){
        this.mark = mark;
    }

    public double getMark(){
        return mark;
    }
}
