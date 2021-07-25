package com.ashika.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashika.fleetapp.models.State;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
