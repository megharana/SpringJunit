package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.DBData;
import com.example.demo.Model.Employee;
import com.example.demo.Service.DBAccessService;


@RestController
public class DBAccessController {
	
	@Autowired
	DBAccessService empService;

	
	@RequestMapping(value = "/get/{id}", method=RequestMethod.GET)
	public DBData getName(@PathVariable String id) {
		
		DBData resp = empService.fetchEmployeeDetail(id);
		
		return resp;
	}

}
