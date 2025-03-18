package edu.icet.demo.service;

import edu.icet.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmploye(Employee employee);

    List<Employee> getall();

    void removeEmployee(Long productId);

    void updateEmployee(Employee employee);

    Employee findById(Long id);

    Employee findByfristName(String fristName);
}
