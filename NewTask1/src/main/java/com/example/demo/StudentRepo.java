package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

/**
 * it will do all the crud operations.
 * @author Rupal Joshi
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{
	
					

}
