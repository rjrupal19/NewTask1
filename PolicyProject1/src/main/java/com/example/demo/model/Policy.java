package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy
{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int time_period;
	private String inception_date;
	private String expiry_date;
	
	//monthly,quartly,yearly
	private String maturity_type;
	private String policy_state;
	
	//one policy have one product
//	private Product product;
	
	//getter and setter of id
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	//getter and setter of time_period
	public void setTime_period(int time_period)
	{
		this.time_period= time_period;
	}
	
	//getter and setter of inception_date
	public void setEncepion_date(String inception_date)
	{
		this.inception_date = inception_date;
	}
	
	public String getInception_date()
	{
		return inception_date;
	}
	
	//getter and setter of expiry_date
	public void setExpiryDate(String expiry_date)
	{
		this.expiry_date= expiry_date;
	}
	
	public String getExpiryDate()
	{
		return expiry_date;
	}
	
	//getter and setter of maturity type
	public void setMaturity_Type()
	{
		this.maturity_type = maturity_type;
	}
	
	public String getMaturity_type()
	{
		return maturity_type;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", time_period=" + time_period + ", inception_date=" + inception_date
				+ ", expiry_date=" + expiry_date + ", maturity_type=" + maturity_type + ", policy_state=" + policy_state
				+ "]";
	}
	
	
	
	

}
