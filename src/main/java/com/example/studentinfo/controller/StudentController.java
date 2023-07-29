package com.example.studentinfo.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.studentinfo.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student-info")
	public ResponseEntity<List<Student>> getStudentInfo() {
		List<Student> studentList = new ArrayList<>();
		Student student1 = new Student();
		student1.setRollno(1);
		student1.setName("Kathir");
		
		Student student2 = new Student();
		student2.setRollno(2);
		student2.setName("Dharani");
		
		studentList.add(student1);
		studentList.add(student2);
		
		return new ResponseEntity<>(studentList, HttpStatus.OK);
	}
}
