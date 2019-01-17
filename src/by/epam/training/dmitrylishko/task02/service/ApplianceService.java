package by.epam.training.dmitrylishko.task02.service;

import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {
    <E> List<E> find(Criteria<E> criteria) throws IOException;
}
