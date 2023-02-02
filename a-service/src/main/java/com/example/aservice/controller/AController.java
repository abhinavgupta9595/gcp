package com.example.aservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aservice.dto.Employee;
import com.example.aservice.service.AService;

@RestController
public class AController {

	@Autowired
	AService aServ;
	
	@Value("${module.service.name}")
	private String servName;
	
	@GetMapping("/getEmpDetailsWithSalary")
	public ResponseEntity<Employee> getEmpDetailsWithSalary(@RequestParam(name = "empNum") int empNum) throws Exception
	{
		return ResponseEntity.ok(aServ.getEmpDetailsWithSalary(empNum));
	}
	
	@GetMapping("/upcheck")
	public ResponseEntity<String> upCheck()
	{
		return ResponseEntity.ok(servName + " is up and running");
	}
}
