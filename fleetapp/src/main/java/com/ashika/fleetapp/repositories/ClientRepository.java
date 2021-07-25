package com.ashika.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashika.fleetapp.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
