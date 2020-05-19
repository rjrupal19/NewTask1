package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudentRepo;
import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController

@RequestMapping("home1")

public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	
	@GetMapping(path = "/student")
	public List<Student> getAllStudent()
	{

		return studentService.findAll();		
	}

	
	@PostMapping(path = "/student")
	public String addStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return "added";
	}
	
	@PutMapping(path = "/student")
	public String updateStudent(@RequestBody Student student)
	{
		studentService.updateStudent(student);
		return "Updated";
		
	}
	
	@DeleteMapping(path = "/student")
	public String deleteStudent(@PathVariable int id)
	{
		Student st = studentService.getOne(id);
		studentService. deleteStudent(st);
		return "deleted";
		
	}
	
	
}
