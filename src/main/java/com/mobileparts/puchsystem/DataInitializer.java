package com.mobileparts.puchsystem;

import com.mobileparts.puchsystem.model.Employee;
import com.mobileparts.puchsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    public EmployeeService employeeService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("   TESTING EMPLOYEE CRUD OPERATIONS");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println("\n");
        // TEST 1: CREATE EMPLOYEES
        System.out.println("📝 TEST 1: Creating Employees...\n");
        Employee emp1 = employeeService.createEmployee(
                "Contract",
                "abinbasheer@gmail.com",
                "Assembly",
                "Basheer",
                "Abin",
                "EMP001"
        );
        System.out.println("✅ Created: " + emp1 + "\n");

        Employee emp2 = employeeService.createEmployee(
                "Contract",
                "jiswanhope@gmail.com",
                "Assembly",
                "jiswan",
                "muhammed",
                "EMP002"
        );
        System.out.println("✅ Created: " + emp2 + "\n");

        // Employee count
        long count = employeeService.getEmployeeCount();
        System.out.println("✅ Employee Count: " + count + "\n");

        //List all employees
        List<Employee> emp = employeeService.getAllEmployee();
        System.out.println("✅ : " + emp.size() + "Employees\n");
        for (Employee e:emp)
        {
            System.out.println("   - " + emp);
        }
        System.out.println("\n");

        //Findbyid
        Employee empid = employeeService.getEmployeeById("EMP002");
        System.out.println("✅ Found Employee by id : " +empid.getEmployeeId() + " :\n"+empid);

        //deactive
        Employee deactiveEmployee = employeeService.deactivateEmployee("EMP002");
        System.out.println("✅ Employee Deactive: " + deactiveEmployee + "\n");
        List<Employee> updated  = employeeService.getAllEmployee();
        for(Employee e :updated)
        {
            System.out.println("-"+e);
        }
        System.out.println("\n");




    }
}
