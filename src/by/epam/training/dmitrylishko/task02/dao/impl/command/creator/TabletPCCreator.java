package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.TabletPC;

import java.util.List;

public class TabletPCCreator implements Creator{
    @Override
    public TabletPC create(List<String> list) {
        TabletPC tabletPC=new TabletPC();
        setAllParameters(list, tabletPC);
        return tabletPC;
    }

    public void setAllParameters(List<String> list,TabletPC tabletPC){
        tabletPC.setBatteryCapacity(Double.parseDouble(RegEx.extractNumber(list.get(1))));
        tabletPC.setDisplayInches(Integer.parseInt(RegEx.extractNumber(list.get(2))));
        tabletPC.setMemoryRom(Integer.parseInt(RegEx.extractNumber(list.get(3))));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(RegEx.extractNumber(list.get(4))));
        tabletPC.setColor(RegEx.extractSimpleWord(list.get(5)));
    }
}
