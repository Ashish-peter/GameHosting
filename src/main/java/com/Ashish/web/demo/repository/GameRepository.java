package com.Ashish.web.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Ashish.web.demo.models.Game;

@Repository
public interface GameRepository extends MongoRepository<Game,Integer> {
	 
	@Override
	List<Game> findAll();
	
}
