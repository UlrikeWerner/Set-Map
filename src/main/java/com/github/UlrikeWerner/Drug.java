package com.github.UlrikeWerner;

import java.util.Objects;

public class Drug {
    private String name;
    private int price;
    private boolean availability;

    public Drug(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug drug = (Drug) o;
        return price == drug.price && availability == drug.availability && Objects.equals(name, drug.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, availability);
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
