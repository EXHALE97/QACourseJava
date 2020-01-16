package javacollections.maintask.ammunition.bottombody;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;

import java.util.Objects;

public class Trousers extends Ammo {
    private int externalPocketCount;
    private boolean wearResistantPanels;

    public Trousers() {
    }

    public Trousers(double price,
                    double weight,
                    Materials material,
                    Brands brand,
                    String model,
                    int externalPocketCount,
                    boolean wearResistantPanels) {
        super(price, weight, material, brand, model);
        this.externalPocketCount = externalPocketCount;
        this.wearResistantPanels = wearResistantPanels;
    }

    public int getExternalPocketCount() {
        return externalPocketCount;
    }

    public void setExternalPocketCount(int externalPocketCount) {
        this.externalPocketCount = externalPocketCount;
    }

    public boolean isWearResistantPanels() {
        return wearResistantPanels;
    }

    public void setWearResistantPanels(boolean wearResistantPanels) {
        this.wearResistantPanels = wearResistantPanels;
    }

    @Override
    public String toString() {
        return "Trousers - " + super.toString() +
                ", External pocket count: " + externalPocketCount +
                ", Wear-resistant panels: " + wearResistantPanels +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trousers trousers = (Trousers) o;
        return externalPocketCount == trousers.externalPocketCount &&
                wearResistantPanels == trousers.wearResistantPanels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), externalPocketCount, wearResistantPanels);
    }
}
