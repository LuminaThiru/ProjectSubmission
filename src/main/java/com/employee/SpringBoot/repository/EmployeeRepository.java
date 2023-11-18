package com.employee.SpringBoot.repository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.SpringBoot.Employee;
import com.employee.SpringBoot.queries.Queries;

@Repository
public class EmployeeRepository {
	
	@Autowired
	NamedParameterJdbcTemplate npJdbcTmpl;

	
//to save a employee in database
	public void saveEmployeeData(Employee employee) {
		String insertQuery= Queries.INSERT_EMP_DATA;
		Map<String,Object> inData= new HashMap<>();
		inData.put("EMP_ID", employee.getEmpId());
		inData.put("FIRST_NAME", employee.getFirstName());
		inData.put("LAST_NAME", employee.getLastName());		
		inData.put("AGE", employee.getAge());
		inData.put("GENDER", employee.getGender());
		inData.put("LOCATION", employee.getLocation());
		inData.put("EMAIL", employee.getEmail());
		inData.put("PHONE", employee.getPhone());
		npJdbcTmpl.update(insertQuery,inData);	
		
	}


//to update a employee in database 
	public void updateEmployeeData(Employee employee) {
		String updateQuery= Queries.UPDATE_EMP_DATA;
		Map<String,Object> inData= new HashMap<>();
		inData.put("EMP_ID", employee.getEmpId());
		inData.put("FIRST_NAME", employee.getFirstName());
		inData.put("LAST_NAME", employee.getLastName());		
		inData.put("AGE", employee.getAge());
		inData.put("GENDER", employee.getGender());
		inData.put("LOCATION", employee.getLocation());
		inData.put("EMAIL", employee.getEmail());
		inData.put("PHONE", employee.getPhone());
		npJdbcTmpl.update(updateQuery,inData);	
}


	public void deleteAllEmployeeRecords() {
		String deleteAllQuery= Queries.DELETE_ALL_EMP_DATA;
		Map<String,Object> inData= new HashMap<>();
		npJdbcTmpl.update(deleteAllQuery,inData);	
	}


	public void deleteEmployeeById(Long empId) {
		String deleteOneEmpQuery= Queries.DELETE_EMP_BY_ID;
		Map<String,Object> inData= new HashMap<>();
		inData.put("EMP_ID",empId);
		npJdbcTmpl.update(deleteOneEmpQuery,inData);
	}


	public List<Map<String, Object>> getAllEmployee() {
		String getAllEmp = Queries.GET_ALL_DATA; 
		Map<String,Object> inData= new HashMap<>();
		return npJdbcTmpl.queryForList(getAllEmp, inData);
	}


	public List<Map<String,Object>>  getEmployeeById(Long empId) {
		String getEmpById = Queries.GET_EMP_BY_ID; 
		Map<String,Object> inData= new HashMap<>();
		inData.put("EMP_ID",empId);
		return npJdbcTmpl.queryForList(getEmpById, inData);
		
	}



		
	


	
	
}
