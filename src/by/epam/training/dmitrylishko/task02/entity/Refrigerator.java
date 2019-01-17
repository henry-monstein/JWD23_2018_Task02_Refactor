package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class Refrigerator extends ConsumerElectronic {
    private int freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
    }

    public Refrigerator(int powerConsumption, double weight, double height, double width, int freezerCapacity, double overallCapacity) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) o;
        return that.getPowerConsumption() == getPowerConsumption() &&
                Double.compare(that.getWeight(), getWeight()) == 0 &&
                that.freezerCapacity == freezerCapacity &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                Double.compare(that.getHeight(), getHeight()) == 0 &&
                Double.compare(that.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + getPowerConsumption() +
                ", weight=" + getWeight() +
                ", freexerCapacity=" + getFreezerCapacity() +
                ", owerallCapacity=" + getOverallCapacity() +
                ", height=" + getHeight() +
                ", width=" + getWidth() +
                '}';
    }
}
