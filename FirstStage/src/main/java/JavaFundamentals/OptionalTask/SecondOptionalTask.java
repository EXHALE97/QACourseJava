package main.java.JavaFundamentals.OptionalTask;

import java.util.ArrayList;
import java.util.Scanner;


public class SecondOptionalTask {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insert n: ");
        int n = in.nextInt();

        System.out.println("Insert m: ");
        int m = in.nextInt();
        int maxNumber = -(m + 1);
        int minNumber =  m + 1;

        Matrix matrix = new Matrix(n,m);
        System.out.println("Initial matrix:");
        matrix.show();

        System.out.println("\nTask 2: Find and output the largest number of increasing (decreasing) matrix elements in a row.");
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        ArrayList<Integer> numberListTemp = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(maxNumber < matrix.matr[i][j]){
                    maxNumber = matrix.matr[i][j];
                    numberListTemp.add(matrix.matr[i][j]);
                } else {
                    if(numberList.size() <= numberListTemp.size()){
                        numberList.clear();
                        for (int iTemp=0; iTemp<numberListTemp.size(); iTemp++){
                            numberList.add(numberListTemp.get(iTemp));
                        }
                    }
                    numberListTemp.clear();
                    numberListTemp.add(matrix.matr[i][j]);
                    maxNumber = numberListTemp.get(0);
                }
            }
        }
        System.out.println("Increasing numbers quantity: " + numberList.size());
        System.out.print("Final list of increasing numbers: ");
        for(int i=0; i<numberList.size(); i++){
            System.out.print(numberList.get(i) + " ");
        }
        System.out.println();
        numberList.clear();
        numberListTemp.clear();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(minNumber >= matrix.matr[i][j]){
                    minNumber = matrix.matr[i][j];
                    numberListTemp.add(matrix.matr[i][j]);
                } else {
                    if(numberList.size() <= numberListTemp.size()){
                        numberList.clear();
                        for (int iTemp=0; iTemp<numberListTemp.size(); iTemp++){
                            numberList.add(numberListTemp.get(iTemp));
                        }
                    }
                    numberListTemp.clear();
                    numberListTemp.add(matrix.matr[i][j]);
                    minNumber = numberListTemp.get(0);
                }
            }
        }

        System.out.println("Decreasing numbers quantity: " + numberList.size());
        System.out.print("Final list of decreasing numbers: ");
        for(int i=0; i<numberList.size(); i++){
            System.out.print(numberList.get(i) + " ");
        }
        numberList.clear();
        numberListTemp.clear();

    }
}
