package javafundamentals.maintask;

public class FourthTask {
    public static void main( String[] args )
    {
        int sum = 0;
        int multiplication = 1;

        if (args.length!=0){
            for (int i=0; i < args.length; i++){
                sum += Integer.parseInt(args[i]);
            }

            for (int i=0; i < args.length; i++){
                multiplication *= Integer.parseInt(args[i]);
            }

            System.out.println("Number sum is " + sum + "\n" + "Number multiplication is " + multiplication);
        } else {
            System.out.println("There are no arguments!");
        }
    }
}
