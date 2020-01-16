package javacollections.optionaltask;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FourthOptionalTask {
    public static void main (String[] args) throws Exception{
        Scanner fileReader = new Scanner(new FileReader("resources\\fourthOptionalCollections.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (fileReader.hasNextLine()) {
            list.add(fileReader.nextLine());
        }
        fileReader.close();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()- o1.length();
            }
        });

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
