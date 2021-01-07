package com.techprimers.repository;

import com.techprimers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Component
@RepositoryRestResource
public interface UserJpaRespository extends JpaRepository<User, Long>{

    User findByName(String name);
	
	/*
    @Override
    @RestResource(exported = false)
    void deleteAll();
	*/

}
