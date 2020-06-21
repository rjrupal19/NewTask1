package com.example.demo.controller;

import com.example.demo.model.request.CreatePolicyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController
{
	@Autowired
	PolicyService policyService;

	@PostMapping(path = "/")
	public ResponseEntity<String> createPolicy(@RequestBody CreatePolicyRequest createPolicyRequest)
	{
		Policy policy = policyService.create(createPolicyRequest);
		return ResponseEntity.ok(policy.toString());
	}

}
