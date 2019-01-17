package by.epam.training.dmitrylishko.task02.service.validation;

import by.epam.training.dmitrylishko.task02.dao.impl.command.creator.RegEx;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

public class OvenValidator implements Validator {
    @Override
    public boolean validate(Criteria criteria, Object[] keyArray) {
        for (Object key : keyArray) {
            if (!RegEx.isNumber(String.valueOf(criteria.getValue(key)))) {
                return false;
            }
        }
        return true;
    }
}
