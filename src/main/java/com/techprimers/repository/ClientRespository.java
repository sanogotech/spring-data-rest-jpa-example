package com.techprimers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.techprimers.model.Client;

@RepositoryRestResource
public interface ClientRespository extends JpaRepository<Client, Long>{


}
