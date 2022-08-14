package com.podlasenko.example.department;

import org.junit.Before;
import org.junit.Test;

import static com.podlasenko.example.TestData.prepareHeadDepartment;
import static org.junit.Assert.assertEquals;

public class DepartmentTest {

    private Department department;

    @Before
    public void setup() {
        department = prepareHeadDepartment("TEST");
    }

    @Test
    public void getDepartmentName_ShouldReturnChildDepartments_UsingHeadDepartment() {
        String result = department.getDepartmentName();
        assertEquals("[SalesDepartment[Sales department:TEST_1], " +
                        "FinancialDepartment[Financial department:TEST_2]]", result);
    }
}
