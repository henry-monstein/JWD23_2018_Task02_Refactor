package by.epam.training.dmitrylishko.task02.service.impl;

import by.epam.training.dmitrylishko.task02.dao.ApplianceDAO;
import by.epam.training.dmitrylishko.task02.dao.DAOFactory;
import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;
import by.epam.training.dmitrylishko.task02.service.ApplianceService;
import by.epam.training.dmitrylishko.task02.service.validation.Command;
import by.epam.training.dmitrylishko.task02.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public <E> List<E> find(Criteria<E> criteria) throws IOException {
        if(!criteriaValidator(criteria)){
            return null;
        }
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        List<E> collectionApplianceUnit=  applianceDAO.find(criteria);
        return collectionApplianceUnit;
    }

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {

        Command commander = new Command();
        Validator command=commander.getCommand(criteria.getApplianceType());

        return command.validate(criteria, criteria.getKeyArray());
    }
}
