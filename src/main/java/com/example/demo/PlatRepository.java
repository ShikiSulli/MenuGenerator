package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface PlatRepository extends MongoRepository<Plat, String> {

}