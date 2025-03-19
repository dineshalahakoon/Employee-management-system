package edu.icet.demo.service;

import edu.icet.demo.model.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);


    List<Role> getall();

    Boolean deleteById(Long id);
}
