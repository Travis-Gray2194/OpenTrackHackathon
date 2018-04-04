package me.travisgray.Repositories;



import me.travisgray.Models.Role;
import me.travisgray.Models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.Set;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsername(String username);
    Set<User> findUsersByRoles(Set<Role> roles);
    User findByUsername(String username);
    User findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String email);
}
