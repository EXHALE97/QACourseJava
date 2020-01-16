package javacollections.maintask.ammunition.protection;

import javacollections.maintask.ammunition.Ammo;
import javacollections.maintask.ammunition.Brands;
import javacollections.maintask.ammunition.Materials;

import java.util.Objects;

public class Protection extends Ammo {
    BodyParts part;

    public Protection(){

    }

    public Protection(double price, double weight, Materials material, Brands brand, String model, BodyParts part) {
        super(price, weight, material, brand, model);
        this.part = part;
    }

    public BodyParts getPart() {
        return part;
    }

    public void setPart(BodyParts part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Protection - " + super.toString() +
                ", Protected body part: " + part.getName() +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Protection that = (Protection) o;
        return part == that.part;
    }

    @Override
    public int hashCode() {
        return Objects.hash(part);
    }
}
