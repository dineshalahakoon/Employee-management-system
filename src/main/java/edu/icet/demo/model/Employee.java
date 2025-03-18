package edu.icet.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private  Long id;
    private String fristName;
    private String lastName;
    private String email;
    private String departmentId;
    private String roleId;
}
