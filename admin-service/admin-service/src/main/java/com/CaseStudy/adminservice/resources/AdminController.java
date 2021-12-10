package com.CaseStudy.adminservice.resources;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.CaseStudy.adminservice.repository.AdminRepository;
import com.CaseStudy.adminservice.service.HomeController;
import com.CaseStudy.trainservice.model.Trains;

@RestController
//@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	RestTemplate restTemplate;
	
//	@Autowired
//	HomeController homeController;
	@Autowired
	public AdminController(RestTemplateBuilder restTemplateBuilder)
	{
		this.restTemplate=restTemplateBuilder.build();
	}
	
	public String add(Trains trains) 
	{
		HttpEntity<Trains> entity=new HttpEntity<>(trains);
		return restTemplate.exchange("http://localhost:8000/train-service/train/addTrain", HttpMethod.POST, entity,String.class).getBody();
	}
	
//	public List<Trains> getTrains()
//	{
//		return restTemplate.exchange("http://localhost:8000/train-service/trains/showAllTrains", HttpMethod.GET, null,List.class).getBody();
//	}

	public List<Trains> getTrains() {
		return restTemplate.exchange("http://localhost:8000/train-service/trains/showAllTrains", HttpMethod.GET, null,List.class).getBody();
	}

	
	
	
	
	
	
	
	
	
	
	//
//	public List display(Trains trains) 
//	{
//		return restTemplate.exchange("http://localhost:8002/train-service/trains/showAllTrains", HttpMethod.GET, null,List.class).getBody();
//		
//	}
	
	
	
////--------------------------------------getAll trains---------------------------------
//	public List ConsumeApi()
//	{
//		return restTemplate.getForObject("http://localhost:8002/train-service/trains/showAllTrains",List.class);
//		
//	}
	
	
	
	
	
//	public List ConsumeApi1()
//	{
//		return  restTemplate.getForObject("http://localhost:8002/train-service/trains/addTrain", List.class);
//	}

	
	
	
}



//@RequestMapping("/admin")
//public String hello()
//{
//	return "Hello from Admin service";
//}
//
////----------------Admin can do to user database------------------------
//
