package main.java.JavaFundamentals.OptionalTask;

import java.util.Scanner;


public class FourthOptionalTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insert n: ");
        int n = in.nextInt();

        System.out.println("Insert m: ");
        int m = in.nextInt();
        int maxNumber = -(m + 1);
        int maxI = 0;
        int maxJ = 0;

        Matrix matrix = new Matrix(n,m);
        System.out.println("Initial matrix: \n");
        matrix.show();

        System.out.println("Task 4: Find the maximum element in the matrix and remove all rows and columns containing it from the matrix.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maxNumber <= matrix.matr[i][j]) {
                    maxNumber = matrix.matr[i][j];
                }
            }
        }
        System.out.println("Max element in matrix = " + maxNumber);

        int maxTemp = maxNumber;
        int step = 1;
        while (maxNumber == maxTemp) {
            maxNumber = -(m + 1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (maxNumber <= matrix.matr[i][j]) {
                        maxNumber = matrix.matr[i][j];
                        maxI = i;
                        maxJ = j;
                    }
                }
            }
            if (maxNumber != maxTemp) {
                break;
            }

            System.out.println("Step " + step);
            int delI = maxI;
            int delJ = maxJ;
            Matrix matrixTemp = new Matrix(n-1);
            for (int i = 0, iTemp = 0; iTemp < n - 1; i++) {
                if (i != delI) { //если строка не совпадает с той, которую нужно удалить
                    for (int j = 0, jTemp = 0; jTemp < n - 1; j++, jTemp++) { //то проходим по столбцам чтобы данную строку записать во временную матрицу
                        if (j == delJ) {//если столбец совпадает с тем, который нужно удалить
                            j++; //переходим к следующему столбцу
                        }
                        matrixTemp.matr[iTemp][jTemp] = matrix.matr[i][j]; //а следом уже записываем следующий столбец в матрицу.
                        // если if оказался false, то записывает конкретный столбец
                    }
                    iTemp++;
                }
            }
            matrix.matr = matrixTemp.matr;
            matrix.a--;
            matrix.b--;
            matrix.show();
            n--;
            step++;
        }
        System.out.println("Process finished. There is no element with number " + maxTemp + " in matrix.");
    }
}

