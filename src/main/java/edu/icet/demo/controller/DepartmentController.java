package edu.icet.demo.controller;

import edu.icet.demo.model.Department;
import edu.icet.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {
    final DepartmentService service;

    @PostMapping("/add-department")
    public void addDepartment(@RequestBody Department department){
        service.addDepartment(department);

    }
    @GetMapping("get-all")
    public List<Department> getAllDepartment(){
        return service.getAllDepartment();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public Boolean deleteDepartmentById(@PathVariable Long id){
        return   service.deleteDepartmentById(id);
    }

}
