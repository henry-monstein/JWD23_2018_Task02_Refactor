package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.Oven;

import java.util.List;

public class OvenCreator implements Creator {
    @Override
    public Oven create(List<String> list) {

        Oven oven = new Oven();
        setAllParameters(list, oven);
        return oven;
    }

    private void setAllParameters(List<String> list, Oven oven) {
        oven.setPowerConsumption(Integer.parseInt(RegEx.extractNumber(list.get(1))));
        oven.setWeight(Double.parseDouble(RegEx.extractNumber(list.get(2))));
        oven.setCapacity(Integer.parseInt(RegEx.extractNumber(list.get(3))));
        oven.setDepth(Integer.parseInt(RegEx.extractNumber(list.get(4))));
        oven.setHeight(Double.parseDouble(RegEx.extractNumber(list.get(5))));
        oven.setWidth(Double.parseDouble(RegEx.extractNumber(list.get(6))));
    }
}
