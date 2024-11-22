package com.Project.ValidParenthesis.repository;

import com.Project.ValidParenthesis.model.result;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface resultsRepo extends MongoRepository<result,String> {
}
