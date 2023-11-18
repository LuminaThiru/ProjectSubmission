package com.employee.SpringBoot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.SpringBoot.Employee;
import com.employee.SpringBoot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void saveEmployeeData(Employee employee) {
		employeeRepository.saveEmployeeData(employee);
	}

	public void updateEmployeeData(Employee employee) {
		employeeRepository.updateEmployeeData(employee);
		
	}

	public void deleteAllEmployeeRecords() {
		employeeRepository.deleteAllEmployeeRecords();
	}

	public void deleteEmployeeById(Long empId) {
		employeeRepository.deleteEmployeeById(empId);
	}
	
	public List<Map<String, Object>> getAllEmployee() {
		 return employeeRepository.getAllEmployee();
		
	}
	
	public List<Map<String, Object>> getEmployeeById(Long empId) {
		 return employeeRepository.getEmployeeById(empId);
	}
	
	
}
