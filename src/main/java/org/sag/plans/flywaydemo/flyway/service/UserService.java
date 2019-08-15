package org.sag.plans.flywaydemo.flyway.service;

import org.sag.plans.flywaydemo.flyway.domain.User;
import org.sag.plans.flywaydemo.flyway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    UserRepository userRepo;
    
	public Iterable<User> getAllUsers() {
		return userRepo.findAll();
	}

}
