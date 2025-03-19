package edu.icet.demo.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="employee")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String fristName;
    private String lastName;
    private String email;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private RoleEntity role;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<DepartmentEntity> departmentlist;

    /*
   {
    "fristName":"saman,
    "lastName":"kumara",
    "email":"nene",
    "departmentId":"005",
    "role": {
    "description":"Hr",
    "name":"manager"
    }

"department":[
{
"name":"Human Resource",
"description":"handel employee relations"
"employee":{
    "id":1
    }
},

{
"name":"Finance",
"description":"manage finance"
"employee":{
    "id":2
    }


    }
]

 }



    */

}
