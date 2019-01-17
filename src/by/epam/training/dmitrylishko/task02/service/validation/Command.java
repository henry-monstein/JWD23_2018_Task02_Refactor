package by.epam.training.dmitrylishko.task02.service.validation;

import java.util.HashMap;
import java.util.Map;

public class Command {
    private Map<String, Validator> commands = new HashMap<>();

    public Command() {
        commands.put("Oven", new OvenValidator());
        commands.put("Laptop", new LaptopValidator());
        commands.put("Speakers", new SpeakersValidator());
        commands.put("TabletPC", new TabletPCValidator());
        commands.put("Refrigerator", new RefrigeratorValidator());
        commands.put("VacuumCleaner", new VacuumCleanerValidator());
    }

    public Validator getCommand(String applianceType) {

        Validator command;
        command = commands.get(applianceType);
        return command;
    }
}
