package com.ashika.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashika.fleetapp.models.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
