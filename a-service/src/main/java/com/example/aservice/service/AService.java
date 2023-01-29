package com.example.aservice.service;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aservice.dto.Employee;
import com.example.aservice.restclient.ARestClient;

@Service
public class AService {

	private static final Map<Integer, Integer> salaryMap = Stream.of(
            new SimpleEntry<>(101, 10000),
            new SimpleEntry<>(102, 20000),
            new SimpleEntry<>(103, 15000))
    .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));
  
	@Autowired
	ARestClient restClient;
	
	public Employee getEmpDetailsWithSalary(int empNum) throws Exception
	{
		Employee emp = restClient.getEmpDetails(empNum);
		emp.setEmpSalary(salaryMap.get(emp.getEmpId()));
		return emp;
	}
}
