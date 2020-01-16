package javacollections.maintask.ammunition.topbody;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;

import java.util.Objects;

public class Jacket extends Ammo {
    private int layerCount;
    private int externalPocketCount;
    private int internalPocketCount;
    private boolean adjustmentSystem;
    private boolean waterproofSystem;

    public Jacket(){
    }

    public Jacket(double price,
                  double weight,
                  Materials material,
                  Brands brand,
                  String model,
                  int layerCount,
                  int externalPocketCount,
                  int internalPocketCount,
                  boolean adjustmentSystem,
                  boolean waterproofSystem) {
        super(price, weight, material, brand, model);
        this.layerCount = layerCount;
        this.externalPocketCount = externalPocketCount;
        this.internalPocketCount = internalPocketCount;
        this.adjustmentSystem = adjustmentSystem;
        this.waterproofSystem = waterproofSystem;
    }

    public int getLayerCount() {
        return layerCount;
    }

    public void setLayerCount(int layerCount) {
        this.layerCount = layerCount;
    }

    public int getExternalPocketCount() {
        return externalPocketCount;
    }

    public void setExternalPocketCount(int externalPocketCount) {
        this.externalPocketCount = externalPocketCount;
    }

    public int getInternalPocketCount() {
        return internalPocketCount;
    }

    public void setInternalPocketCount(int internalPocketCount) {
        this.internalPocketCount = internalPocketCount;
    }

    public boolean isAdjustmentSystem() {
        return adjustmentSystem;
    }

    public void setAdjustmentSystem(boolean adjustmentSystem) {
        this.adjustmentSystem = adjustmentSystem;
    }

    public boolean isWaterproofSystem() {
        return waterproofSystem;
    }

    public void setWaterproofSystem(boolean waterproofSystem) {
        this.waterproofSystem = waterproofSystem;
    }

    @Override
    public String toString() {
        return "Jacket - " + super.toString() +
                ", Layer count: " + layerCount +
                ", External pocket count: " + externalPocketCount +
                ", Internal pocket count: " + internalPocketCount +
                ", Adjustment system: " + adjustmentSystem +
                ", Waterproof system: " + waterproofSystem + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jacket jacket = (Jacket) o;
        return layerCount == jacket.layerCount &&
                externalPocketCount == jacket.externalPocketCount &&
                internalPocketCount == jacket.internalPocketCount &&
                adjustmentSystem == jacket.adjustmentSystem &&
                waterproofSystem == jacket.waterproofSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), layerCount, externalPocketCount, internalPocketCount, adjustmentSystem, waterproofSystem);
    }
}
