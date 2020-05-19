package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService
{
		List<Student> findAll();	
		
		Student findById(Integer stu_id);
		
		Student saveStudent(Student student);
		
		Student updateStudent(Student student);
				
		Student deleteStudent(Student student);

		Student getOne(int id);
		

}
