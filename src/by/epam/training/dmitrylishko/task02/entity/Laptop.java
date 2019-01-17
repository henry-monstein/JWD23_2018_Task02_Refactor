package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class Laptop extends Computer {
    private String OS;
    private int systemMemory;
    private double CPU;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String OS, int memoryRom, int systemMemory, double CPU, int displayInchs) {
        super(batteryCapacity, displayInchs, memoryRom);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0 &&
                laptop.getMemoryRom() == getMemoryRom() &&
                laptop.systemMemory == systemMemory &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                laptop.getDisplayInches() == getDisplayInches() &&
                Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), OS, systemMemory, CPU);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + getBatteryCapacity() +
                ", OS='" + getOS() + '\'' +
                ", memoryRom=" + getMemoryRom() +
                ", systemMemory=" + getSystemMemory() +
                ", CPU=" + getCPU() +
                ", displayInchs=" + getDisplayInches() +
                '}';
    }
}
