package com.gustavoalves.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gustavoalves.workshopmongo.domain.Post;

@Repository
public interface PostRepository2 extends MongoRepository<Post, String>{
	
    @Query("{ 'title': { $regex: ?0, $options: 'i'} }")
	List<Post> searchTitle(String text);
	
	List<Post> finByTitleContainingIgnoreCase(String text);

}
