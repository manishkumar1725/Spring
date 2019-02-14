package com.manish.springdata.LoginRepostiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manish.springdata.login.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findOneByName(String name);

    public User getUsername(String Id);

}
