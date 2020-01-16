package javacollections.maintask.ammunition.bottombody;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;

import java.util.Objects;

public class Boots extends Ammo {
    private Materials liningMaterial;
    private boolean builtInProtectors;

    public Boots() {
    }

    public Boots(double price,
                 double weight,
                 Materials material,
                 Brands brand,
                 String model,
                 Materials liningMaterial,
                 boolean builtInProtectors) {
        super(price, weight, material, brand, model);
        this.liningMaterial = liningMaterial;
        this.builtInProtectors = builtInProtectors;
    }

    public Materials getLiningMaterial() {
        return liningMaterial;
    }

    public void setLiningMaterial(Materials liningMaterial) {
        this.liningMaterial = liningMaterial;
    }

    public boolean isBuiltInProtectors() {
        return builtInProtectors;
    }

    public void setBuiltInProtectors(boolean builtInProtectors) {
        this.builtInProtectors = builtInProtectors;
    }

    @Override
    public String toString() {
        return "Boots - " + super.toString() +
                ", Lining material: " + liningMaterial.getType() +
                ", Built-in protectors: " + builtInProtectors +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boots boots = (Boots) o;
        return builtInProtectors == boots.builtInProtectors &&
                liningMaterial == boots.liningMaterial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liningMaterial, builtInProtectors);
    }
}
