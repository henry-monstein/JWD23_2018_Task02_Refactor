package by.epam.training.dmitrylishko.task02.main;

import by.epam.training.dmitrylishko.task02.dao.impl.ApplianceDAOImpl;
import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.Oven;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;
import by.epam.training.dmitrylishko.task02.entity.criteria.SearchCriteria;
import by.epam.training.dmitrylishko.task02.service.ApplianceService;
import by.epam.training.dmitrylishko.task02.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();


        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(SearchCriteria.Oven.CAPACITY, 3);
        List<SearchCriteria.Oven> appliance = service.find(criteriaOven);
        PrintApplianceInfo.print(appliance);


        criteriaOven = new Criteria<>();
        criteriaOven.setApplianceType("Oven");
        criteriaOven.add(SearchCriteria.Oven.HEIGHT, 200);
        criteriaOven.add(SearchCriteria.Oven.DEPTH, 300);
        appliance = service.find(criteriaOven);
        PrintApplianceInfo.print(appliance);


        Criteria<SearchCriteria.TabletPC> criteriaTabletPC = new Criteria<>();
        criteriaTabletPC.setApplianceType("TabletPC");
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR, "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM, 4000);
        appliance = service.find(criteriaOven);
        PrintApplianceInfo.print(appliance);

    }
}
