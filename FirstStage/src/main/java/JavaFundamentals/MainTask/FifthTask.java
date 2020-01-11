package main.java.JavaFundamentals.MainTask;

import java.util.Scanner;

public class FifthTask {
    public static void main( String[] args ){
        Scanner in = new Scanner(System.in);
        String month = "";

        while (true){
            System.out.println("Insert number: ");
            int number = in.nextInt();
            if(number > 0 && number < 13){
                switch(number)
                {
                    case 1:month="January";break;
                    case 2:month="February";break;
                    case 3:month="March";break;
                    case 4:month="April";break;
                    case 5:month="May";break;
                    case 6:month="June";break;
                    case 7:month="July";break;
                    case 8:month="August";break;
                    case 9:month="September";break;
                    case 10:month="October";break;
                    case 11:month="November";break;
                    case 12:month="December";break;
                    default:
                        System.out.println("Try again!");break;
                }
                System.out.println("Month corresponding to number " + number + " is " + month);
            } else {
                System.out.println("Error! Number doesen't belong to specified range!");
            }
        }
    }
}