package com.learning.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learning.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
