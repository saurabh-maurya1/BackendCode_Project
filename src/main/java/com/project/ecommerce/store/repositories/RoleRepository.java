package com.project.ecommerce.store.repositories;

import com.project.ecommerce.store.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,String> {
}
