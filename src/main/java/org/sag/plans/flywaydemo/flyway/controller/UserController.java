package org.sag.plans.flywaydemo.flyway.controller;

import java.util.List;

import org.sag.plans.flywaydemo.flyway.domain.User;
import org.sag.plans.flywaydemo.flyway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> refreshToken() throws Exception {
		List<User> users = null;
		try {
			users = (List<User>) userService.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}
