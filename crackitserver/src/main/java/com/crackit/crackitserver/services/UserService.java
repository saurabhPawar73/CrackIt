package com.crackit.crackitserver.services;


import com.crackit.crackitserver.models.User;
import com.crackit.crackitserver.models.User_Role;


import java.util.Set;

public interface UserService {

    public User registerUser(User user, Set<User_Role> userRoles);
    public User findUserByUsername(String username);

    void deleteUser(Long id);
}
