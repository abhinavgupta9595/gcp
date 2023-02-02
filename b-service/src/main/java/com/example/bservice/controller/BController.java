package com.example.bservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bservice.dto.Employee;
import com.example.bservice.service.BService;

@RestController
public class BController {

	@Autowired
	BService bServ;
	
	@Value("${module.service.name}")
	private String servName;
	
	@GetMapping("/employeeDetails")
	@ResponseBody
	public ResponseEntity<Employee> getEmpDetails(@RequestParam(name = "empNum") int empNum)
	{
		return ResponseEntity.ok(bServ.getEmpDetails(empNum));
	}
	
	@GetMapping("/upcheck")
	public ResponseEntity<String> upCheck()
	{
		return ResponseEntity.ok(servName + " is up and running");
	}
}
