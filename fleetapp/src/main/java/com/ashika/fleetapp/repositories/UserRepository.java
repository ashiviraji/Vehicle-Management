package com.ashika.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashika.fleetapp.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
