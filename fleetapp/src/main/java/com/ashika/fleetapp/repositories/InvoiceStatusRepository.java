package com.ashika.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashika.fleetapp.models.Client;
@Repository
public interface InvoiceStatusRepository extends JpaRepository<Client, Integer> {

}
