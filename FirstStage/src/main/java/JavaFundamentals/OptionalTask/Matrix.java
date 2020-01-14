package javafundamentals.optionaltask;

import java.util.Random;

public class Matrix {

    int a;
    int b;
    public int[][] matr;

    public Matrix(int n){
        this.a=n;
        this.b=n;
        matr = new int[n][n];
    }

    public Matrix(int n, int m){
        this.a=n;
        this.b=n;
        Random random = new Random();
        matr = new int[n][n];

        for(int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                matr[i][j] = random.nextInt((2*m)+1) -m;
            }
        }
    }

    public void show(){
        for(int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
