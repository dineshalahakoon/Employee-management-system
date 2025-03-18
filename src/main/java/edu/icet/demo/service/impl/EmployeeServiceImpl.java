package edu.icet.demo.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.Entity.EmployeeEntity;
import edu.icet.demo.model.Employee;
import edu.icet.demo.repository.EmployeeRepository;
import edu.icet.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    //ObjectMapper mapper=new ObjectMapper();

   final EmployeeRepository repository;

    @Override
    public void addEmploye(Employee employee) {
        EmployeeEntity employeeEntity
                = new ObjectMapper().convertValue(employee, EmployeeEntity.class);
        EmployeeEntity savedEmploye = repository.save(employeeEntity);


    }

    @Override
    public List<Employee> getall() {
        Iterable<EmployeeEntity> allProducts = repository.findAll();
        List<Employee> foodList=new ArrayList<>();
        allProducts.forEach(studentEntity -> {
            foodList.add(new ObjectMapper().convertValue(studentEntity,Employee.class));
        });
        return foodList;
    }

    @Override
    public void removeEmployee(Long Id) {

        if (repository.existsById(Id))
        {
            repository.deleteById(Id);}

    }
    @Override
    public void updateEmployee(Employee employee) {
        if(repository.findById(employee.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(employee, EmployeeEntity.class));
        }
    }

    @Override
    public Employee findById(Long id) {
        if(repository.findById(id).isPresent()){
            Optional<EmployeeEntity> byId = repository.findById(id);
            return new ObjectMapper().convertValue(byId.get(), Employee.class);
        }

        return new Employee();
    }

    @Override
    public Employee findByfristName(String fristName) {
        return new ObjectMapper().convertValue(repository.findByFristName(fristName),Employee.class);


    }
}
