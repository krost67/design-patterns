package com.podlasenko.example.depatrment;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private List<Department> childDepartments;

    public HeadDepartment() {
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public String getDepartmentName() {
        List<String> children = new ArrayList<>();
        childDepartments.forEach(e -> children.add(e.getDepartmentName()));

        return children.toString();
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
