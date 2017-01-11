package com.generic.database.bootstrap;

import com.generic.database.RoleRepository;
import com.generic.database.UserRepository;
import com.generic.model.Role;
import com.generic.model.User;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Jens on 10.01.2017.
 */
public class DatabaseBootstrap implements InitializingBean{

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void afterPropertiesSet() throws Exception {

        if(userRepository.findByFirstnameAndLastname("Jens","Häderer") == null) {
            User user = new User();
            user.setFirstname("Jens");
            user.setLastname("Häderer");
            user.setEmail("j.haederer@gmx.de");
            userRepository.save(user);

        }
        if(roleRepository.findRoleByRoleName("OWNER")== null){
            Role role = new Role();
            role.setRoleName("OWNER");
            role.setRoleDescription("Is the owner of an organisation unit, it can appoint admins and it can change the description of the unit and is allowed to delete it");
            roleRepository.save(role);
        }
    }
}
