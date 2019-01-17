package by.epam.training.dmitrylishko.task02.dao.impl.command;

import by.epam.training.dmitrylishko.task02.dao.impl.command.creator.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCommand {
    private Map<String, Creator> commands = new HashMap<>();

    public ApplianceCommand() {

        commands.put("Oven", new OvenCreator());
        commands.put("Laptop", new LaptopCreator());
        commands.put("Refrigerator", new RefrigeratorCreator());
        commands.put("VacuumCleaner", new VacuumCleanerCreator());
        commands.put("Speakers", new SpeakersCreator());
        commands.put("TabletPC", new TabletPCCreator());

    }

    public Creator FindCriteria(String applianceType) {
        Creator command = commands.get(applianceType);
        return command;
    }

}
