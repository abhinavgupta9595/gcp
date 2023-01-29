package com.example.bservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bservice.dto.Employee;

@Service
public class BService {

	public static List<Employee> empList = Arrays.asList(
			new Employee(1, 101, "John Smith"),
			new Employee(2, 102, "Ray Rhodes"),
			new Employee(3, 103, "Brent Kaylor"));
	
	public Employee getEmpDetails(int empNum)
	{
		return empList.stream().filter(emp -> emp.getEmpNum()==empNum)
				.findFirst().get();
	}
}
