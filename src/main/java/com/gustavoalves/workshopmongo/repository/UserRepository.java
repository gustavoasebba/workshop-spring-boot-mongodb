package com.gustavoalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gustavoalves.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
