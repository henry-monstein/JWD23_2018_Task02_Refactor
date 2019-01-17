package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public abstract class ConsumerElectronic extends ElectricalEngineering {
    private double weight;
    private double height;
    private double width;

    public ConsumerElectronic() {
    }

    public ConsumerElectronic(int powerConsumption, double weight, double height, double width) {
        super(powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConsumerElectronic)) return false;
        if (!super.equals(o)) return false;
        ConsumerElectronic that = (ConsumerElectronic) o;
        return Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), weight, height, width);
    }

    @Override
    public String toString() {
        return "ConsumerElectronic{" +
                "weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
