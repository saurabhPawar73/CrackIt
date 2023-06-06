package com.crackit.crackitserver.controller;

import com.crackit.crackitserver.models.Role;
import com.crackit.crackitserver.models.User;
import com.crackit.crackitserver.models.User_Role;
import com.crackit.crackitserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/crackit")
@CrossOrigin("*")
public class controller {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){

        Set<User_Role> userRoles=new HashSet<>();
        Role role=new Role();
        role.setRoleID(46l);
        role.setRoleName("normal");

        User_Role user_role=new User_Role();
        user_role.setUser(user);
        user_role.setRole(role);

        userRoles.add(user_role);

        return userService.registerUser(user,userRoles);
    }

    @GetMapping("/getUser/{username}")
    public User getUserByUsername(@PathVariable(name = "username") String username){
        return userService.findUserByUsername(username);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserById(@PathVariable(name = "id")Long id){
        userService.deleteUser(id);
    }
}