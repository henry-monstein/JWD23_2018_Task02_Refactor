package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public abstract class Computer extends Appliance {
    private double batteryCapacity;
    private int displayInches;
    private int memoryRom;

    public Computer() {
    }

    public Computer(double batteryCapacity, int displayInches, int memoryRom) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(computer.displayInches, displayInches) == 0 &&
                Double.compare(computer.memoryRom, memoryRom) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryRom);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "batteryCapacity=" + getBatteryCapacity()+
                ", displayInches=" + getDisplayInches() +
                ", memoryRom=" + getMemoryRom() +
                '}';
    }
}
