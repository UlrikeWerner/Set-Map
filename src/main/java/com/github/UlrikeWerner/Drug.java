package com.github.UlrikeWerner;

import java.util.Objects;

public class Drug {
    private String drugName;
    private double price;
    private boolean availability;

    public Drug(String drugName) {
        this.drugName = drugName;
    }
    public Drug(String drugName, double price) {
        this.drugName = drugName;
        this.price = price;
    }
    public Drug(String drugName, double price, boolean availability) {
        this.drugName = drugName;
        this.price = price;
        this.availability = availability;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getPrice() {
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
        return price == drug.price && availability == drug.availability && Objects.equals(drugName, drug.drugName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drugName, price, availability);
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + drugName + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
