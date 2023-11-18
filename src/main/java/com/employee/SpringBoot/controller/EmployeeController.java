package com.employee.SpringBoot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.SpringBoot.Employee;
import com.employee.SpringBoot.service.EmployeeService;



@RequestMapping("/employee/api/v1/")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/")
	public void saveEmployeeData(@RequestBody Employee employee) {
		employeeService.saveEmployeeData(employee);
	}
	
	@PutMapping("/")
	public void updateEmployeeData(@RequestBody Employee employee) {
		employeeService.updateEmployeeData(employee);
	}
	
	@DeleteMapping("/")
	public void deleteAllEmployeeRecords() {
		employeeService.deleteAllEmployeeRecords();
	}
	
	@DeleteMapping("/{id}")
	public void deleteAllEmployeeRecords(@PathVariable ("id") Long empID) {
		employeeService.deleteEmployeeById(empID);
	}
	
	@GetMapping("/")
	public List<Map<String,Object>> getAllEmployee() {
		return employeeService.getAllEmployee();
		 
	}
	
	@GetMapping("/{id}")
	public List<Map<String,Object>>  getEmployeeById(@PathVariable("id") Long empId) {
		return employeeService.getEmployeeById(empId);
	}
}
