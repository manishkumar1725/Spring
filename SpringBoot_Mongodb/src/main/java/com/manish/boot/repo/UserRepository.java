package com.manish.boot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manish.boot.model.User;

public interface UserRepository extends MongoRepository< User, String> {

	User findOne(String userId);
	User create(User user);

}
