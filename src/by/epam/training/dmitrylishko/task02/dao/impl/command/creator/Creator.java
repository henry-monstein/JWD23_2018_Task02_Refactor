package by.epam.training.dmitrylishko.task02.dao.impl.command.creator;

import by.epam.training.dmitrylishko.task02.entity.Appliance;

import java.util.List;

public interface Creator {
    Appliance create(List<String> list);
}
