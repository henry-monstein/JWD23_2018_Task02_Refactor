package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.Laptop;

import java.util.List;

public class LaptopCreator implements Creator {
    @Override
    public Laptop create(List<String> list) {

        Laptop laptop = new Laptop();
        setAllParameters(list, laptop);
        return laptop;
    }

    private void setAllParameters(List<String> list, Laptop laptop) {
        laptop.setBatteryCapacity(Double.parseDouble(RegEx.extractNumber(list.get(1))));
        laptop.setOS(RegEx.extractSimpleWord(list.get(2)));
        laptop.setMemoryRom(Integer.parseInt(RegEx.extractNumber(list.get(3))));
        laptop.setSystemMemory(Integer.parseInt(RegEx.extractNumber(list.get(4))));
        laptop.setCPU(Double.parseDouble(RegEx.extractNumber(list.get(5))));
        laptop.setDisplayInches(Integer.parseInt(RegEx.extractNumber(list.get(6))));

    }
}
