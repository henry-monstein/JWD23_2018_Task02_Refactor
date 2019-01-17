package by.epam.training.dmitrylishko.task02.entity;

import java.util.Objects;

public abstract class ElectricalEngineering extends Appliance {
    private int powerConsumption;

    public ElectricalEngineering() {
    }

    public ElectricalEngineering(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricalEngineering)) return false;
        ElectricalEngineering that = (ElectricalEngineering) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), powerConsumption);
    }

    @Override
    public String toString() {
        return "ElectricalEngineering{" +
                "powerConsumption=" + powerConsumption +
                '}';
    }
}
