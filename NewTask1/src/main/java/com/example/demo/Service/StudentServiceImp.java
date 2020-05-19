package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StudentRepo;
import com.example.demo.model.Student;

@Service
public class StudentServiceImp implements StudentService
{
	@Autowired
	StudentRepo st;
	
	@Override
	public List<Student> findAll()
	{
		 return st.findAll();
	}

	@Override
	public Student findById(Integer stu_id) {
		st.findById(stu_id);
		return null;
	}

	@Override
	public Student saveStudent(Student student) 
	{
	  return st.save(student);
		
	}

	@Override
	public Student updateStudent(Student student) {
		return st.save(student);
		
	}

	@Override
	public Student deleteStudent(Student student)
	{
		 st.delete(student);
		 return null;
		
	}

	@Override
	public Student getOne(int id) {
		Student student = st.getOne(id);
		return student;
	}

	

	
}
