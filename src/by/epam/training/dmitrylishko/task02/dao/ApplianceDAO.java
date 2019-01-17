package by.epam.training.dmitrylishko.task02.dao;

import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
    <E> List<E> find(Criteria<E> creteria) throws IOException;
}
