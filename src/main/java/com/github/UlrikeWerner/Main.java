package com.github.UlrikeWerner;

public class Main {
    public static void main(String[] args) {
        Pharmacy moinApotheke = new Pharmacy();
        moinApotheke.addDrug(new Drug("Asperin", 2.99, true));
        moinApotheke.addDrug(new Drug("Hustensaft", 5.99, false));

        System.out.println(moinApotheke.getDrugInformation("Hustensaft"));
        System.out.println(moinApotheke.getDrugInformation("Test"));
        moinApotheke.updateAvailability("Hustensaft", true);
        System.out.println(moinApotheke);
        System.out.println(moinApotheke.countDrugs());
    }
}
