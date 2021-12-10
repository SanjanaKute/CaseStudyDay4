package com.CaseStudy.trainservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.trainservice.model.Trains;

public interface TrainRepository extends MongoRepository<Trains, String> {

	Optional<Trains> findByStartStation(String startStation);

	Optional<Trains> findByEndStation(String endStation);

}
