package com.ashika.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashika.fleetapp.models.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
