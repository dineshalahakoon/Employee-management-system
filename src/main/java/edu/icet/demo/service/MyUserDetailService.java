package edu.icet.demo.service;

import edu.icet.demo.model.User;
import edu.icet.demo.securiryModel.UserPrinciple;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user = mapper.map(repository.findByUsername(username),User.class);
        if(user==null){
            throw new UsernameNotFoundException("usr Name Not Found");
        }
        return new UserPrinciple(user);
    }
}
