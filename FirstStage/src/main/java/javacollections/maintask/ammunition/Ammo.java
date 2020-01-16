package javacollections.maintask.ammunition;

import java.util.Objects;

public class Ammo {
    private double price;
    private double weight;
    private Materials material;
    private Brands brand;
    private String model;

    public Ammo(){
    }

    public Ammo(double price, double weight, Materials material, Brands brand, String model){
        this.weight = weight;
        this.price = price;
        this.material = material;
        this.brand = brand;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Materials getMaterial() {
        return material;
    }

    public void setMaterial(Materials material) {
        this.material = material;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Price: " + price +
                ", Weight: " + weight +
                ", Material: " + material.getType() +
                ", Brand: " + brand.getProducer() +
                ", Model: " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ammo ammo = (Ammo) o;
        return Double.compare(ammo.price, price) == 0 &&
                Double.compare(ammo.weight, weight) == 0 &&
                material == ammo.material &&
                brand == ammo.brand &&
                Objects.equals(model, ammo.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, material, brand, model);
    }
}
