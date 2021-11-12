package com.umakant.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMethod()
	{
		return "User Service is taking longe than expected";
	}
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallbackMethod()
	{
		return "department Service is taking longe than expected";
	}

}
