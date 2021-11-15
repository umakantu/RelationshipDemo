package com.umakant.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.umakant.userservice.VO.Department;
import com.umakant.userservice.VO.ResponseTemplateVO;
import com.umakant.userservice.entity.User;
import com.umakant.userservice.repository.UserServiceRepository;

@Service
public class UserService {
	@Autowired
	UserServiceRepository userServiceRepository;
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userServiceRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO(); 
		User user=userServiceRepository.findByUserId(userId);
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getUserId(), Department.class);
		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department); 
		return responseTemplateVO;
	}

}
