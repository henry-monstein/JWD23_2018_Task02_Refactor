package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.Refrigerator;

import java.util.List;

public class RefrigeratorCreator implements Creator {
    @Override
    public Refrigerator create(List<String> list) {
        Refrigerator refrigerator = new Refrigerator();
        setAllParameters(list, refrigerator);
        return refrigerator;
    }

    public void setAllParameters(List<String> list, Refrigerator refrigerator) {
        refrigerator.setPowerConsumption(Integer.parseInt(RegEx.extractNumber(list.get(1))));
        refrigerator.setWeight(Double.parseDouble(RegEx.extractNumber(list.get(2))));
        refrigerator.setFreezerCapacity(Integer.parseInt(RegEx.extractNumber(list.get(3))));
        refrigerator.setOverallCapacity(Double.parseDouble(RegEx.extractNumber(list.get(4))));
        refrigerator.setHeight(Double.parseDouble(RegEx.extractNumber(list.get(5))));
        refrigerator.setWidth(Double.parseDouble(RegEx.extractNumber(list.get(6))));
    }
}
