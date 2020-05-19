package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

//@Controller  
@RestController   //  (now no need to write @ResponseBody in every get,post request automatically it will know that some request is coming )
public class AlienController 
{
	@Autowired  //it will intanse ated the object of alien repository
	AlienRepo repo;
	 
	
	
//	@RequestMapping("/home1")								
	public String home()
	{
		return "home.jsp";
	}
	
	
	
	@PostMapping("/addAlien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	
	@PutMapping("/updateAlien")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid)
	{
		Alien a = repo.getOne(aid);
		repo.delete(a);
		
		return "deleted";
	}
	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid) // request param is something from which u can fetch value from the client
//	{
//		With jsp
//		ModelAndView mv = new ModelAndView("ShowAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien()); // to handle null values we use optional<Alien>
//		mv.addObject(alien);
//		
//		
//		System.out.println(repo.findByTech("Java"));
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByTechSorted("Java"));
		
//		return mv;
		
		
		// With rest API																	
	
	@GetMapping(path= "/aliens")
//	@ResponseBody
	public List<Alien> getAliens()  //findAll() will always return list<alien>
	{
		return repo.findAll();    //Jakson JAR file is responsible to convert java object into json object which is present in MAVEN dependency
		
	}
	
	
	
																											
	@GetMapping("/alien/{aid}")										
//	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) // optional means it will accept null value as well
	{
		return repo.findById(aid);
	}

}
