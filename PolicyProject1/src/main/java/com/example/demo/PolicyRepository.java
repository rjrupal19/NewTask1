package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>
{
}
