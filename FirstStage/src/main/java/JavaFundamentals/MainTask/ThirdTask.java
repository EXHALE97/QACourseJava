package main.java.JavaFundamentals.MainTask;

import java.util.Random;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Insert number amount: ");
        int numberAmount = in.nextInt();

        for (int i=0; i<numberAmount; i++){
            System.out.println(random.nextInt());
        }

        System.out.println();

        for (int i=0; i<numberAmount; i++){
            System.out.print(random.nextInt() + " ");
        }
    }
}