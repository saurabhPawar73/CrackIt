package com.crackit.crackitserver.repos;

import com.crackit.crackitserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String username);
}
