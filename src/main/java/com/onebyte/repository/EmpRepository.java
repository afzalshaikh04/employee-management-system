package com.onebyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onebyte.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
