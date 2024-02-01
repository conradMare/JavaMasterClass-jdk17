package dev.lpa.domain;

import java.util.Comparator;

public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

//        SORT BY EMPLOYEE NAME:
        return o1.getName().compareTo(o2.getName());
    }
}
