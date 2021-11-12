package com.umakant.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umakant.departmentservice.entity.Department;
import com.umakant.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
 
	public Department findByDepartmentId(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
