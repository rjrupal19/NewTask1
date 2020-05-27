package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Policy;

public interface PolicyRepo extends JpaRepository<Policy, Integer>
{
	
	
}
