package com.example.bservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/employeeDetails")
	@ResponseBody
	public ResponseEntity<Employee> getEmpDetails(@RequestParam(name = "empNum") int empNum)
	{
		return ResponseEntity.ok(bServ.getEmpDetails(empNum));
	}
}
