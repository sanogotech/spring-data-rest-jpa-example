package com.techprimers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.techprimers.model.client.Client;
import com.techprimers.model.client.Contrat;

@RepositoryRestResource
public interface ContratRespository extends JpaRepository<Contrat, Long>{


}
