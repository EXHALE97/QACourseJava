package javacollections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstOptionalTask {
    public static void main (String[] args) throws Exception{
        Scanner fileReader = new Scanner(new FileReader("resources\\firstOptionalCollections.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (fileReader.hasNextLine()) {
            list.add(fileReader.nextLine());
        }
        fileReader.close();

        FileWriter fileWriter = new FileWriter("resources\\firstOptionalCollections.txt");
        for (int i = list.size()-1; i >= 0 ; i--){
            fileWriter.write(list.get(i) + "\r\n");
        }
        fileWriter.close();
    }
}
