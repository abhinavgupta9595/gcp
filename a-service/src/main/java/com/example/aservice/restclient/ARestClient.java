package com.example.aservice.restclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.aservice.dto.Employee;

@Service
public class ARestClient {

	@Value("${serviceb.uri.empdetails}")
	private String bServUri;
	
	public Employee getEmpDetails(int empNum) throws Exception
	{
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Employee> response = restTemplate.getForEntity(bServUri + "?empNum=" + empNum, Employee.class);
		if(response.getStatusCode() == HttpStatus.OK)
		{
			return response.getBody();
		}
		else
		{
			throw new Exception();
		}
	}
}
