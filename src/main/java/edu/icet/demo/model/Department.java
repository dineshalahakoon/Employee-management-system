package edu.icet.demo.model;

import edu.icet.demo.Entity.EmployeeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Department {

    private Long id;
    private String name;
    private String description;
    private Employee employee;
}
