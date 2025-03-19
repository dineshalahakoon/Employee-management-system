package edu.icet.demo.service;

import edu.icet.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmploye(Employee employee);

    List<Employee> getall();

    void removeEmployee(String productId);

    void updateEmployee(Employee employee);

    Employee findById(String id);

    Employee findByfristName(String fristName);
}
