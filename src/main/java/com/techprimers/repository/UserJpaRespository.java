package com.techprimers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.techprimers.model.client.User;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserJpaRespository extends JpaRepository<User, Long>{

    User findByName(String name);
	
	/*
    @Override
    @RestResource(exported = false)
    void deleteAll();
	*/

}
