package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public abstract class Appliance {
    public String getOptions() {
        return toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        return "Appliance{}";
    }
}
