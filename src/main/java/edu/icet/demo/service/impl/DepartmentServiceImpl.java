package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.Entity.DepartmentEntity;
import edu.icet.demo.model.Department;
import edu.icet.demo.repository.DepartmentRepository;
import edu.icet.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    final DepartmentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addDepartment(Department department) {
        repository.save(mapper.map(department, DepartmentEntity.class));

    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> DepartmentList = new ArrayList<>();
        repository.findAll().forEach(obj ->{
            DepartmentList.add(mapper.map(obj, Department.class));
        });
        return DepartmentList;
    }

    @Override
    public boolean deleteDepartmentById(Long id) {
            repository.deleteById(id);
            return true;
    }
}
