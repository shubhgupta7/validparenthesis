package com.Project.ValidParenthesis.repository;

import com.Project.ValidParenthesis.model.stackInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface stackInfoRepo extends MongoRepository<stackInfo, String>{
}
