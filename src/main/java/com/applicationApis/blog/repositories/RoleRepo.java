package com.applicationApis.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationApis.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
