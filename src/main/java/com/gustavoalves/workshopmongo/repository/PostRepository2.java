package com.gustavoalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustavoalves.workshopmongo.domain.Post;

@Repository
public interface PostRepository2 extends MongoRepository<Post, String>{

}
