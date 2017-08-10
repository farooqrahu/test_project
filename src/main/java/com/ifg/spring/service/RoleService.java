package com.ifg.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifg.spring.model.Role;
import com.ifg.spring.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public Role findByName(String name){
		return roleRepository.findByName(name);
	}
	
	public Role saveRole(Role name){
		return roleRepository.save(name);
	}
}
