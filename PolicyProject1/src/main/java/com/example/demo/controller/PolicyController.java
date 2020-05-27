package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;

@RestController

@RequestMapping("task")

public class PolicyController 
{
	@Autowired
	PolicyService pol_ser;
	
	
	@PostMapping(path = "/policy")
//	@Consumes(MediaType.APPLICATION_JSON)
	public String createPolicy(@RequestBody Policy policy)
	{
		pol_ser.savePolicy(policy);
		
		return "created sucessfully";
		
	}

}
