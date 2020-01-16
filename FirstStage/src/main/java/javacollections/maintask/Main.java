package javacollections.maintask;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;
import javacollections.maintask.ammunition.bottombody.*;
import javacollections.maintask.ammunition.protection.*;
import javacollections.maintask.ammunition.topbody.*;
import javacollections.maintask.ammunition.topbody.helmet.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Motorcyclist motorcyclist = new Motorcyclist();
        motorcyclist.ammunition = equipMotorcyclist();

        System.out.println("List of ammunition:");
        showAmmoList(motorcyclist.ammunition);

        System.out.println("\n1) Total cost of all ammo: " + motorcyclist.countCostOfAmmo());
        System.out.println("\n2) List of ammo sorted by weight:");
        showAmmoList(motorcyclist.sortAmmoOnWeightBase().ammunition);

        System.out.println("\n3) Insert bounds of price range: ");
        int lowerBound = in.nextInt();
        int upperBound = in.nextInt();
        showAmmoList(motorcyclist.findAmmoElementsThatMatchSpecifiedPriceRange(lowerBound, upperBound));

    }

    public static void showAmmoList(ArrayList<? extends Ammo> ammoList){
        for (int i = 0; i < ammoList.size(); i++){
            System.out.println(ammoList.get(i).toString());
        }
    }

    public static ArrayList <Ammo> equipMotorcyclist() {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("resources\\Ammo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
        ArrayList<String> list = new ArrayList<String>();
        while (fileReader.hasNextLine()) {
            list.add(fileReader.nextLine());
        }
        fileReader.close();

        ArrayList<Ammo> ammoList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] lineOfParameters = list.get(i).trim().split(",");
            if (lineOfParameters[0].equals("Helmet")) {
                ammoList.add(new Helmet(Double.valueOf(lineOfParameters[1]), Double.valueOf(lineOfParameters[2]), HelmetConstructions.valueOf(lineOfParameters[3]),
                        Brands.valueOf(lineOfParameters[4]), lineOfParameters[5], Materials.valueOf(lineOfParameters[6]),
                        Boolean.valueOf(lineOfParameters[7])));
            } else if (lineOfParameters[0].equals("Jacket")) {
                ammoList.add(new Jacket(Double.valueOf(lineOfParameters[1]), Double.valueOf(lineOfParameters[2]), Materials.valueOf(lineOfParameters[3]),
                        Brands.valueOf(lineOfParameters[4]), lineOfParameters[5], Integer.valueOf(lineOfParameters[6]),
                        Integer.valueOf(lineOfParameters[7]), Integer.valueOf(lineOfParameters[8]), Boolean.valueOf(lineOfParameters[9]),
                        Boolean.valueOf(lineOfParameters[10])));
            } else if (lineOfParameters[0].equals("Gloves")) {
                ammoList.add(new Gloves(Double.valueOf(lineOfParameters[1]), Double.valueOf(lineOfParameters[2]), Materials.valueOf(lineOfParameters[3]),
                        Brands.valueOf(lineOfParameters[4]), lineOfParameters[5], Materials.valueOf(lineOfParameters[6]),
                        Boolean.valueOf(lineOfParameters[7]), Boolean.valueOf(lineOfParameters[8])));
            } else if (lineOfParameters[0].equals("Trousers")) {
                ammoList.add(new Trousers(Double.valueOf(lineOfParameters[1]), Double.valueOf(lineOfParameters[2]), Materials.valueOf(lineOfParameters[3]),
                        Brands.valueOf(lineOfParameters[4]), lineOfParameters[5], Integer.valueOf(lineOfParameters[6]),
                        Boolean.valueOf(lineOfParameters[7])));
            } else if (lineOfParameters[0].equals("Boots")) {
                ammoList.add(new Boots(Double.valueOf(lineOfParameters[1]), Double.valueOf(lineOfParameters[2]), Materials.valueOf(lineOfParameters[3]),
                        Brands.valueOf(lineOfParameters[4]), lineOfParameters[5], Materials.valueOf(lineOfParameters[6]),
                        Boolean.valueOf(lineOfParameters[7])));
            } else if (lineOfParameters[0].equals("Protection")) {
                ammoList.add(new Protection(Double.valueOf(lineOfParameters[1]), Double.valueOf(lineOfParameters[2]), Materials.valueOf(lineOfParameters[3]),
                        Brands.valueOf(lineOfParameters[4]), lineOfParameters[5], BodyParts.valueOf(lineOfParameters[6])));
            }
        }
        return ammoList;
    }
}
