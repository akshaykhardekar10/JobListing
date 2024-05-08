package com.telusko.joblisting.repository;

import com.telusko.joblisting.Collections.SignUp;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends MongoRepository<SignUp, ObjectId> {
}