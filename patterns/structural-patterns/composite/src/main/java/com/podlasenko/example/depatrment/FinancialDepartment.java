package com.podlasenko.example.depatrment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FinancialDepartment implements Department {

    private final String id;
    private final String name;

    @Override
    public String getDepartmentName() {
        return getClass().getSimpleName() + "[" + name + ":" + id + "]";
    }
}
