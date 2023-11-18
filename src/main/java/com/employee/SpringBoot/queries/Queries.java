package com.employee.SpringBoot.queries;

public class Queries {

	public static String INSERT_EMP_DATA ="INSERT INTO employee "
			+ "(empId,firstName,lastName,age,gender,location,email,phone)VALUES"
			+ "(:EMP_ID,:FIRST_NAME,:LAST_NAME,:AGE,:GENDER,:LOCATION,:EMAIL,:PHONE);";
	public static String UPDATE_EMP_DATA="UPDATE employee SET firstName=:FIRST_NAME, "
			+ "lastName=:LAST_NAME,age=:AGE,gender=:GENDER,location=:LOCATION,email=:EMAIL,phone=:PHONE WHERE empId=:EMP_ID";
	public static String DELETE_ALL_EMP_DATA= "DELETE FROM employee";
	public static  String DELETE_EMP_BY_ID = "DELETE FROM employee WHERE empId=:EMP_ID";
	public static String GET_ALL_DATA = "Select * from employee";
	public static String GET_EMP_BY_ID = "Select * from employee where empId=:EMP_ID";

	

		}

