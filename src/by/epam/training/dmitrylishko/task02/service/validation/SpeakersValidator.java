package by.epam.training.dmitrylishko.task02.service.validation;

import by.epam.training.dmitrylishko.task02.dao.impl.command.creator.RegEx;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;
import by.epam.training.dmitrylishko.task02.entity.criteria.SearchCriteria;

public class SpeakersValidator implements Validator {
    @Override
    public boolean validate(Criteria criteria, Object[] keyArray) {

        for (Object key : keyArray) {
            if (SearchCriteria.Speakers.FREQUENCY_RANGE.equals(key)) {
                if (!RegEx.isNumber(String.valueOf(criteria.getValue(key)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
