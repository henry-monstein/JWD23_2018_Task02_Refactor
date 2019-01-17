package by.epam.training.dmitrylishko.task02.service.validation;

import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

public interface Validator {
    boolean validate(Criteria criteria, Object[] keyArray);
}
