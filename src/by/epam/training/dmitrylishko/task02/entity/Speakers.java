package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class Speakers extends ElectricalEngineering {
    private int numberOfSpeakers;
    private double lowFrequencyRange;
    private double topFrequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, double lowFrequencyRange, double topFrequencyRange, double cordLength) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.lowFrequencyRange = lowFrequencyRange;
        this.topFrequencyRange = topFrequencyRange;
        this.cordLength = cordLength;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getLowFrequencyRange() {
        return lowFrequencyRange;
    }

    public void setLowFrequencyRange(double lowFrequencyRange) {
        this.lowFrequencyRange = lowFrequencyRange;
    }

    public double getTopFrequencyRange() {
        return topFrequencyRange;
    }

    public void setTopFrequencyRange(double topFrequencyRange) {
        this.topFrequencyRange = topFrequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return speakers.getPowerConsumption() == getPowerConsumption() &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                Double.compare(speakers.lowFrequencyRange, lowFrequencyRange) == 0 &&
                Double.compare(speakers.topFrequencyRange, topFrequencyRange) == 0 &&
                Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfSpeakers, lowFrequencyRange, topFrequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + getPowerConsumption() +
                ", numberOfSpeakers=" + getNumberOfSpeakers() +
                ", lowFrequencyRange=" + getLowFrequencyRange() +
                ", topFrequencyRange=" + getTopFrequencyRange() +
                ", cordLength=" + getCordLength() +
                '}';
    }
}