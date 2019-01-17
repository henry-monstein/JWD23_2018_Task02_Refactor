package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.Speakers;

import java.util.List;

public class SpeakersCreator implements Creator {
    @Override
    public Speakers create(List<String> list){
        Speakers speakers=new Speakers();
        setAllParameters(list, speakers);
        return speakers;
    }

    public void setAllParameters(List<String> list, Speakers speakers){
        speakers.setPowerConsumption(Integer.parseInt(RegEx.extractNumber(list.get(1))));
        speakers.setNumberOfSpeakers(Integer.parseInt(RegEx.extractNumber(list.get(2))));
        speakers.setLowFrequencyRange(Double.parseDouble(RegEx.extractFrequencyRange(list.get(3).split("-")[0])));
        speakers.setTopFrequencyRange(Double.parseDouble(RegEx.extractFrequencyRange(list.get(3).split("-")[1])));
        speakers.setCordLength(Double.parseDouble(RegEx.extractNumber(list.get(4))));
    }
}
