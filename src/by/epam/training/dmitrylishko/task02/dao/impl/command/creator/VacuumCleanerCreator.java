package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.VacuumCleaner;

import java.util.List;

public class VacuumCleanerCreator implements Creator {
    @Override
    public VacuumCleaner create(List<String> list) {
        VacuumCleaner vacuumCleaner =new VacuumCleaner();
        setAllParameters(list, vacuumCleaner);
        return vacuumCleaner;
    }

    public void setAllParameters(List<String> list, VacuumCleaner vacuumCleaner){
        vacuumCleaner.setPowerConsumption(Integer.parseInt(RegEx.extractNumber(list.get(1))));
        vacuumCleaner.setFilterType(RegEx.extractFilterType(list.get(2)));
        vacuumCleaner.setBagType(RegEx.extractBagType(list.get(3)));
        vacuumCleaner.setWandType(RegEx.extractWandType(list.get(4)));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(RegEx.extractNumber(list.get(5))));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(RegEx.extractNumber(list.get(6))));
    }
}
