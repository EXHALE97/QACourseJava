package javacollections.maintask.ammunition.topbody;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;

import java.util.Objects;

public class Gloves extends Ammo {
    private Materials liningMaterial;
    private boolean fingerProtection;
    private boolean doubleLayerAtWearPoints;

    public Gloves() {
    }

    public Gloves(double price,
                  double weight,
                  Materials material,
                  Brands brand,
                  String model,
                  Materials liningMaterial,
                  boolean fingerProtection,
                  boolean doubleLayerAtWearPoints) {
        super(price, weight, material, brand, model);
        this.liningMaterial = liningMaterial;
        this.fingerProtection = fingerProtection;
        this.doubleLayerAtWearPoints = doubleLayerAtWearPoints;
    }

    public Materials getLiningMaterial() {
        return liningMaterial;
    }

    public void setLiningMaterial(Materials liningMaterial) {
        this.liningMaterial = liningMaterial;
    }

    public boolean isFingerProtection() {
        return fingerProtection;
    }

    public void setFingerProtection(boolean fingerProtection) {
        this.fingerProtection = fingerProtection;
    }

    public boolean isDoubleLayerAtWearPoints() {
        return doubleLayerAtWearPoints;
    }

    public void setDoubleLayerAtWearPoints(boolean doubleLayerAtWearPoints) {
        this.doubleLayerAtWearPoints = doubleLayerAtWearPoints;
    }

    @Override
    public String toString() {
        return "Gloves - " + super.toString() +
                ", Lining material: " + liningMaterial.getType() +
                ", Finger protection: " + fingerProtection +
                ", Double layer: " + doubleLayerAtWearPoints + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gloves gloves = (Gloves) o;
        return fingerProtection == gloves.fingerProtection &&
                doubleLayerAtWearPoints == gloves.doubleLayerAtWearPoints &&
                liningMaterial == gloves.liningMaterial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liningMaterial, fingerProtection, doubleLayerAtWearPoints);
    }
}
