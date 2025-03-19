package edu.icet.demo.controller;

import edu.icet.demo.model.Role;
import edu.icet.demo.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    final RoleService service;



    @PostMapping("/add-role")
    public void addRole(@RequestBody Role role){
            service.addRole(role);
    }

    @GetMapping("/get-all")
    public List<Role> get(){
        return service.getall();
    }
@DeleteMapping("/delete-by-id/{id}")
    public Boolean deleteRoleById(@PathVariable Long id){
      return   service.deleteById(id);
}


}
