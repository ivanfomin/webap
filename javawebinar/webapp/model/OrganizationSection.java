package javawebinar.webapp.model;

import javawebinar.webapp.model.*;
import javawebinar.webapp.model.Organization;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * GKislin
 * 26.12.2014.
 */
public class OrganizationSection extends javawebinar.webapp.model.Section {
    private List<javawebinar.webapp.model.Organization> values = new LinkedList<>();

    public OrganizationSection() {
    }

    public OrganizationSection(javawebinar.webapp.model.Organization... values) {
        this.values = new LinkedList<>(Arrays.asList(values));
    }

    public OrganizationSection(List<javawebinar.webapp.model.Organization> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationSection that = (OrganizationSection) o;

        return !(values != null ? !values.equals(that.values) : that.values != null);

    }

    @Override
    public int hashCode() {
        return values != null ? values.hashCode() : 0;
    }

    @Override
    public String toString() {
        return values.toString();
    }

    public List<Organization> getValues() {
        return values;
    }

}
