package by.epam.training.dmitrylishko.task02.service.validation;

import by.epam.training.dmitrylishko.task02.dao.impl.command.creator.RegEx;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;
import by.epam.training.dmitrylishko.task02.entity.criteria.SearchCriteria;

public class VacuumCleanerValidator implements Validator {
    @Override
    public boolean validate(Criteria criteria, Object[] keyArray) {
        for (Object key : keyArray) {
            if (SearchCriteria.VacuumCleaner.FILTER_TYPE.equals(key)
                    || SearchCriteria.VacuumCleaner.BAG_TYPE.equals(key)
                    || SearchCriteria.VacuumCleaner.WAND_TYPE.equals(key)) {
                if (!(criteria.getValue(key) instanceof String) || criteria.getValue(key).toString().isEmpty()) {
                    return false;
                }
            }
            else {
                if (!RegEx.isNumber(String.valueOf(criteria.getValue(key)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
