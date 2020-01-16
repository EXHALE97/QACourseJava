package javacollections.optionaltask;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SixthOptionalTask {
    public static void main (String[] args) throws Exception{
        Scanner fileReader = new Scanner(new FileReader("resources\\sixthOptionalCollections.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (fileReader.hasNextLine()) {
            list.add(fileReader.nextLine());
        }
        fileReader.close();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
