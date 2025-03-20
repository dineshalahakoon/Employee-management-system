package edu.icet.demo.controller;

import edu.icet.demo.model.Employee;
import edu.icet.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/emp-controller")

@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService service;


    @PostMapping("/add-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Employee employee){
         service.addEmploye(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getall(){
        return service.getall();
    }

    @DeleteMapping("/delete-emp/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteEmployee(@PathVariable String id) {
        service.removeEmployee(id);
        return "Deleted";

    }
    @PutMapping("/update-employee")
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);

    }
    
    @GetMapping("fing-by-id/{id}")
    public Employee findById(@PathVariable String id){

         return service.findById(id);
    }
    @GetMapping("/find-by-fristName/{fristName}")
    public Employee findByFristName(@PathVariable String fristName){
        return service.findByfristName(fristName);
    }


}
