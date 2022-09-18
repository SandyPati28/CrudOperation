package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServices studentServices;
	/*
	 * @PostMapping("/save") public Student saveStudent1(Student student) { return
	 * studentServices.saveStudent(student); }
	 */

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student stu = studentServices.saveStudent(student);
		return ResponseEntity.ok().body(stu);
	}

}
