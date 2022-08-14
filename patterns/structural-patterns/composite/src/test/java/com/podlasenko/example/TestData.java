package com.podlasenko.example;

import com.podlasenko.example.depatrment.Department;
import com.podlasenko.example.depatrment.FinancialDepartment;
import com.podlasenko.example.depatrment.HeadDepartment;
import com.podlasenko.example.depatrment.SalesDepartment;

public class TestData {

    public static Department prepareSalesDepartment(String id) {
        return new SalesDepartment(id, "Sales department");
    }

    public static Department prepareFinancialDepartment(String id) {
        return new FinancialDepartment(id, "Financial department");
    }

    public static Department prepareHeadDepartment(String id) {
        HeadDepartment head = new HeadDepartment();
        head.addDepartment(prepareSalesDepartment(id + "_" + 1));
        head.addDepartment(prepareFinancialDepartment(id + "_" + 2));

        return head;
    }
}
