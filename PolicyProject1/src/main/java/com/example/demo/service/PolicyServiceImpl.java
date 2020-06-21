package com.example.demo.service;

import com.example.demo.PolicyRepository;
import com.example.demo.model.PolicyState;
import com.example.demo.model.request.CreatePolicyRequest;
import com.example.demo.model.request.DeletePolicyRequest;
import com.example.demo.model.request.GetPolicyRequest;
import com.example.demo.model.request.UpdatePolicyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Policy;
import java.time.LocalDateTime;

@Service
public class PolicyServiceImpl implements PolicyService
{
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy create(CreatePolicyRequest request) {
		Policy policy = new Policy();
		policy.setCreatedAt(LocalDateTime.now());
		policy.setUpdatedAt(LocalDateTime.now());
		policy.setPolicyLife(request.getPolicyLife());
		policy.setSumInsured(request.getSumInsured());
		policy.setPremiumTerm(request.getPremiumTerm());
		policy.setInceptionDate(request.getInceptionDate());
		policy.setState(PolicyState.CREATED);

		/**
		 * apply business logic here
		 * For ex: calculate premium amount, expiry date, etc.
		 */
		return policyRepository.save(policy);
	}

	@Override
	public Policy update(UpdatePolicyRequest request) {
		return null;
	}

	@Override
	public Policy get(GetPolicyRequest request) {
		return null;
	}

	@Override
	public Policy delete(DeletePolicyRequest request) {
		return null;
	}
}
