package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.Model.DBData;

@Service
public class DBAccessService {
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	public DBData fetchEmployeeDetail(String empId) {
		
		
		
		String baseUrl = "http://dummy.restapiexample.com/api/v1/employee/";
		
		DBData employeeData = webClientBuilder.build().get()
		        .uri(baseUrl+empId)
		        .retrieve()
		        .bodyToMono(DBData.class).block();
		
		System.out.println("Employee name : "+ employeeData.getData());
		
		return employeeData;
	}

}
