package com.podlasenko.example;

public class TestData {

    public static Employee prepareEmployee() {
        Employee employee = new Employee();
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
        return employee;
    }
}
