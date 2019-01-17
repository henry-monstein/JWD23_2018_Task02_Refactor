package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public class TabletPC extends Computer {
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(double batteryCapacity, int displayInchs, int memoryRom, int flashMemoryCapacity, String color) {
        super(batteryCapacity, displayInchs, memoryRom);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.getBatteryCapacity(), getBatteryCapacity()) == 0 &&
                tabletPC.getDisplayInches() == getDisplayInches() &&
                tabletPC.getMemoryRom() == getMemoryRom() &&
                tabletPC.flashMemoryCapacity == flashMemoryCapacity &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + getBatteryCapacity() +
                ", displayInchs=" + getDisplayInches() +
                ", memoryRom=" + getMemoryRom() +
                ", flashMemoryCapacity=" + getFlashMemoryCapacity() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
