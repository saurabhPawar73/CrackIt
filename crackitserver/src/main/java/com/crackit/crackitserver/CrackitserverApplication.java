package com.crackit.crackitserver;

import com.crackit.crackitserver.models.Role;
import com.crackit.crackitserver.models.User;
import com.crackit.crackitserver.models.User_Role;
import com.crackit.crackitserver.repos.UserRepository;
import com.crackit.crackitserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CrackitserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	private final UserRepository userRepository;

	public CrackitserverApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CrackitserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Starting code");

//		User user=new User();
//
//		user.setFirstName("Saurabh");
//		user.setLastName("Pawar");
//		user.setEmail("pawarsaurabh7399@gmail.com");
//		user.setUsername("spcrackit799");
//		user.setPhoneNo("9075662281");
//		user.setPassword("spcool");
//
//		Role role=new Role();
//		role.setRoleID(45l);
//		role.setRoleName("admin");
//
//		Set<User_Role> userRoleSet=new HashSet<>();
//		User_Role user_role=new User_Role();
//		user_role.setRole(role);
//		user_role.setUser(user);
//
//		userRoleSet.add(user_role);
//
//		this.userService.registerUser(user,userRoleSet);

//		System.out.println(user.getUsername());



	}
}
