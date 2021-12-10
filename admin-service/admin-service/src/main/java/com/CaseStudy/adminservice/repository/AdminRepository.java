package com.CaseStudy.adminservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CaseStudy.adminservice.model.Admin;
import com.CaseStudy.trainservice.model.Trains;

@Repository
public interface AdminRepository extends  MongoRepository<Admin, String> {

	

	List<Trains> getTrains(Trains trains);

	

}
