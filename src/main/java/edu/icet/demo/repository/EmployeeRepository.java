package edu.icet.demo.repository;


import edu.icet.demo.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {
    EmployeeEntity findByFristName(String fristName);
}
