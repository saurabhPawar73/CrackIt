package com.crackit.crackitserver.repos;

import com.crackit.crackitserver.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
