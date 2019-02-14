package com.manish.springdata.LoginController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manish.springdata.LoginRepostiory.UserRepository;
import com.manish.springdata.login.User;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/{id}") 
    public User read(@PathVariable String id) {
        return userRepository.findOneByName(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        userRepository.deleteById(id); 
    }

}