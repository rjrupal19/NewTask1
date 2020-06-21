package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * this class uses lombok annotations.
 * Refer: https://www.baeldung.com/lombok-ide for more info
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Policy
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	/**
	 * Unit in days
	 */
	private long policyLife;

	/**
	 * Total amount insured
	 */
	private Double sumInsured;

	/**
	 * Premium to be paid in each premiumTerm
	 */
	private Double premium;

	/**
	 * How frequently premium needs to be paid
	 */
	private PaymentTerm premiumTerm;

	/**
	 * Creation date of policy
	 */
	private LocalDateTime createdAt;
	/**
	 * Last update date of policy
	 */
	private LocalDateTime updatedAt;

	/**
	 * Inception date of policy
	 */
	private LocalDateTime inceptionDate;

	/**
	 * Expiry date of policy
	 */
	private LocalDateTime expiryDate;

	/**
	 * Current policy state
	 */
	private PolicyState state;
}
