package com.example.demo.dao;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
	
	@Query(value="select * from employee where name=?", nativeQuery=true)
	public List<Employee> findByName(String name);

}
