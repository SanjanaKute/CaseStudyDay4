package com.CaseStudy.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.adminservice.model.Admin;
import com.CaseStudy.adminservice.repository.AdminRepository;
import com.CaseStudy.adminservice.resources.AdminController;
import com.CaseStudy.trainservice.model.Trains;

@RestController
@RequestMapping("/admin")
public class HomeController {
	
	
	@Autowired
	private AdminRepository adminRepository;
	
	AdminController admin;
	
	@Autowired
	public HomeController(AdminController admin)
	{
		this.admin=admin;
	}

	
	@PostMapping("/add")
	public String add(@RequestBody Trains trains)
	{
		//admin.add(trains);
		return "Admin Added train with: "+trains.getTrainid();
	}
	
	@GetMapping("/show")
	public List<Trains> getAllList()
	{
		return admin.getTrains();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/")
//	public ResponseEntity<List> consume()
//	{
//		return new ResponseEntity<>(admin.ConsumeApi(), HttpStatus.OK);
//		
//	}
//	
//	
//	@PostMapping("/")
//	public ResponseEntity<List> getTrainsById(@PathVariable("id") String trainid) 
//	{    
//		return new ResponseEntity<>(admin.ConsumeApi1(),HttpStatus.OK);
//	}
//	

	
	
	
}
