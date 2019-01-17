package by.epam.training.dmitrylishko.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {
    private String applianceType;
    private Map<E, Object> criteria = new HashMap<E, Object>();

    public void add(E searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<E, Object> getCriteria() {
        return criteria;
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public Set<Map.Entry<E, Object>> entrySet() {
        return criteria.entrySet();
    }

    public Object[] getKeyArray() {
        return criteria.keySet().toArray();
    }

    public Object getValue(E searchCriteria) {
        return criteria.get(searchCriteria);
    }


}
