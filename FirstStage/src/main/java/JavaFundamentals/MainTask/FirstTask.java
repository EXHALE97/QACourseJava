package javafundamentals.maintask;

import java.util.Scanner;


public class FirstTask {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Introduce yourself: " );
        String userName = in.nextLine();
        System.out.println("Hello, " + userName + "!");
        in.close();
    }
}
