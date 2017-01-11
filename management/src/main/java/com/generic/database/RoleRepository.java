package com.generic.database;

import com.generic.model.Booking;
import com.generic.model.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jens on 10.01.2017.
 */
public interface RoleRepository extends CrudRepository<Role, Long>{

    public Role findRoleByRoleName(String roleName);
}
