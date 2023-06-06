package com.crackit.crackitserver.services.implementations;

import com.crackit.crackitserver.models.User;
import com.crackit.crackitserver.models.User_Role;
import com.crackit.crackitserver.repos.RoleRepository;
import com.crackit.crackitserver.repos.UserRepository;
import com.crackit.crackitserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User registerUser(User user, Set<User_Role> userRoles) {

        User localUser=this.userRepository.findByUsername(user.getUsername());

        if (localUser!=null){
            System.out.println("User already exits, please login");
            throw new RuntimeException("User Exists Already");
        } else {
            for (User_Role ur : userRoles) {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            localUser=this.userRepository.save(user);

        }

        return localUser;
    }

    @Override
    public User findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
