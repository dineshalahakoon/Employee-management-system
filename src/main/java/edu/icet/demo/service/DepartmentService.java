package edu.icet.demo.service;

import edu.icet.demo.model.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);

    List<Department> getAllDepartment();

    boolean deleteDepartmentById(Long id);
}
