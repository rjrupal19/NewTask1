package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PolicyRepo;
import com.example.demo.model.Policy;

@Service
public class PolicyServiceImp implements PolicyService
{
	@Autowired
	PolicyRepo policy_repo;

	@Override
	public Policy savePolicy(Policy policy) 
	{
		return policy_repo.save(policy);
		
		
	}

}
