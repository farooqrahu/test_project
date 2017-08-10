package com.ifg.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifg.spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
