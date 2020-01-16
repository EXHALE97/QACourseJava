package javacollections.maintask;

import javacollections.maintask.ammunition.Ammo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Motorcyclist {
    ArrayList<? extends Ammo> ammunition;

    public Motorcyclist(){
        this.ammunition = new ArrayList<>();
    }

    public double countCostOfAmmo(){
        double totalCost = 0;
        for (int i = 0; i < ammunition.size(); i++){
            totalCost += ammunition.get(i).getPrice();
        }
        return totalCost;
    }

    public Motorcyclist sortAmmoOnWeightBase(){
        Collections.sort(ammunition, new Comparator<Ammo>() {
            @Override
            public int compare(Ammo o1, Ammo o2) {
                return (int)(o2.getWeight()- o1.getWeight());
            }
        });
        return this;
    }

    public ArrayList<? extends Ammo> findAmmoElementsThatMatchSpecifiedPriceRange(double lowerBound, double upperBound){
        ArrayList<? extends Ammo> ammoInSpecifiedRange = this.getAmmunition();
        for (int i = 0; i < ammoInSpecifiedRange.size(); i++){
            if (!(lowerBound <= ammoInSpecifiedRange.get(i).getPrice() && ammoInSpecifiedRange.get(i).getPrice() <= upperBound)){
                ammoInSpecifiedRange.remove(i);
                i--;
            }
        }
        return  ammoInSpecifiedRange;
    }

    public ArrayList<? extends Ammo> getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(ArrayList<? extends Ammo> ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "Motorcyclist{" +
                "ammunition=" + ammunition +
                '}';
    }
}
