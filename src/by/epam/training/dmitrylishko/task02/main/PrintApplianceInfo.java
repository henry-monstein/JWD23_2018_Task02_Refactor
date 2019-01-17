package by.epam.training.dmitrylishko.task02.main;

import by.epam.training.dmitrylishko.task02.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {
    public static void print(List collectionApplianceUnit) {
        if (collectionApplianceUnit != null&collectionApplianceUnit.size() !=0) {
            System.out.println(collectionApplianceUnit.toString());
        } else {
            System.out.println("The search has not given any results!");
        }
    }
}
