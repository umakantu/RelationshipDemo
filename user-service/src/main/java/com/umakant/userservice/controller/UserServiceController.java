package com.umakant.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umakant.userservice.VO.ResponseTemplateVO;
import com.umakant.userservice.entity.User;
import com.umakant.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserServiceController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User save(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId)
	{
		return userService.getUserWithDepartment(userId);
	}

}
