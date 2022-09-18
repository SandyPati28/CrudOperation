package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Service
public class StudentServicesImpl implements StudentServices{
	
    @Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	

}
