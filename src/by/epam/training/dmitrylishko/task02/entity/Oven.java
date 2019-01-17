package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class Oven extends ConsumerElectronic {
    private int capacity;
    private double depth;

    public Oven() {

    }

    public Oven(int powerConsumption, double weight, double height, double width, int capacity, double depth) {
        super(powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity, depth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Oven)) return false;
        Oven oven = (Oven) o;
        return oven.getPowerConsumption() == getPowerConsumption() &&
                Double.compare(oven.getWeight(), getWeight()) == 0 &&
                Double.compare(oven.capacity, capacity) == 0 &&
                Double.compare(oven.depth, depth) == 0 &&
                Double.compare(oven.getHeight(), getHeight()) == 0 &&
                Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + getPowerConsumption() +
                ", weight=" + getWeight() +
                ", capacity=" + getCapacity() +
                ", depth=" + getWeight() +
                ", height=" + getHeight() +
                ", width=" + getWeight() +
                '}';
    }
}
