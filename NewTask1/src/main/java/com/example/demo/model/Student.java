package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String task;
	private boolean completed;
	
	//getter and setter for id
	public void setId(int id) {
		this.id =id;
	}
	
	public int getId()
	{
		return id;
	}
	//getter and setter for task
	public void setTask(String task)
	{
		this.task= task;
	}
	public String getTask()
	{
		return task;
	}
	//getter and setter for isCompleted
	public void setCompleted(boolean completed)
	{
		this.completed= completed;
	}
	public boolean getCompleted()
	{
		return completed;
	}
}


