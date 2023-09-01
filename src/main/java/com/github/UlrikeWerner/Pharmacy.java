package com.github.UlrikeWerner;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {
    private Map<String, Drug> drugList = new HashMap<>();

    public Map<String, Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(Map<String, Drug> drugList) {
        this.drugList = drugList;
    }

    public void addDrug(Drug drug){
        drugList.put(drug.getDrugName(), drug);
    }

    public Drug getDrugInformation(String drugName){
        return drugList.get(drugName);
    }

    public void updateAvailability(String drugName, boolean availability){
        drugList.get(drugName).setAvailability(availability);
    }

    public int countDrugs(){
        return drugList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(drugList, pharmacy.drugList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drugList);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "drugList=" + drugList +
                '}';
    }
}
