package javacollections.maintask.ammunition.topbody.helmet;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;

import java.util.Objects;

public class Helmet extends Ammo {
    private HelmetConstructions construction;
    private boolean pinlock;


    public Helmet(){
    }

    public Helmet(double price,
                  double weight,
                  HelmetConstructions construction,
                  Brands brand,
                  String model,
                  Materials material,
                  boolean pinlock){
        super(price, weight, material, brand, model);
        this.construction = construction;
        this.pinlock = pinlock;
    }

    public HelmetConstructions getConstruction() {
        return construction;
    }

    public void setConstruction(HelmetConstructions construction) {
        this.construction = construction;
    }

    public boolean isPinlock() {
        return pinlock;
    }

    public void setPinlock(boolean pinlock) {
        this.pinlock = pinlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helmet helmet = (Helmet) o;
        return pinlock == helmet.pinlock &&
                construction == helmet.construction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), construction, pinlock);
    }

    @Override
    public String toString() {
        return "Helmet - " + super.toString() +
                ", Construction: " + construction.getName() +
                ", Pinlock: " + pinlock + ";";
    }
}
