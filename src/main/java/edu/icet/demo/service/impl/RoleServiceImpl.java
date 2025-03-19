package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.Entity.RoleEntity;
import edu.icet.demo.model.Role;
import edu.icet.demo.repository.RoleRepository;
import edu.icet.demo.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    final RoleRepository repository;
    final ModelMapper mapper;

    @Override
    public void addRole(Role role) {

        repository.save(mapper.map(role, RoleEntity.class));
    }

    @Override
    public List<Role> getall() {
        List<Role> RoleList = new ArrayList<>();
        repository.findAll().forEach(obj ->{
            RoleList.add(mapper.map(obj, Role.class));
                 });
        return RoleList;
        }

    @Override
    public Boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }
}
