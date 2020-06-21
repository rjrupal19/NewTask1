package com.example.demo.service;

import com.example.demo.model.Policy;
import com.example.demo.model.request.CreatePolicyRequest;
import com.example.demo.model.request.DeletePolicyRequest;
import com.example.demo.model.request.GetPolicyRequest;
import com.example.demo.model.request.UpdatePolicyRequest;

/**
 * Interface for declaring the expected behaviours from PolicyService
 */
public interface PolicyService {
	Policy create(CreatePolicyRequest request);
	Policy update(UpdatePolicyRequest request);
	Policy get(GetPolicyRequest request);
	Policy delete(DeletePolicyRequest request);
}
