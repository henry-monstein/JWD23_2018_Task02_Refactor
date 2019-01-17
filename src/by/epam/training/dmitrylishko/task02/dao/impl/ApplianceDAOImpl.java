package by.epam.training.dmitrylishko.task02.dao.impl;

import by.epam.training.dmitrylishko.task02.dao.ApplianceDAO;
import by.epam.training.dmitrylishko.task02.dao.impl.command.ApplianceCommand;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {
    private final String PATH = System.getProperty("user.dir") + "\\resources\\appliances_db.txt";

    private Reader reader = new Reader();

    String matcherValue;
    String matcherKey;
    String fullMatcher;

    ApplianceCommand applianceCommand = new ApplianceCommand();
    List collectionApplianceUnit = new ArrayList<>();

    @Override
    public <E> List<E> find(Criteria<E> criteria) throws IOException {

        List<List<String>> lists = reader.readListLineSplitByComma(PATH);
        for (List<String> list : lists)
            if (list.get(0).equalsIgnoreCase(criteria.getApplianceType())) {
                for (int i = 1; i < list.size(); i++) {
                    for (Map.Entry<E, Object> entry : criteria.entrySet()) {
                        E key = entry.getKey();
                        Object value = entry.getValue();
                        matcherKey = key.toString();
                        matcherValue = value.toString();
                        fullMatcher = matcherKey + "=" + matcherValue;
                        if (isFindMatcher(list.get(i))) {
                            collectionApplianceUnit.add(applianceCommand.FindCriteria(criteria.getApplianceType()));
                        }
                    }
                }
            }
        return collectionApplianceUnit;
    }

    public boolean isFindMatcher(String getParametr) {

        Pattern validationPattern = Pattern.compile(getParametr);
        Matcher validationMatcher = validationPattern.matcher(fullMatcher);
        return validationMatcher.find();
    }

}
