package com.lambda.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.lambda.entity.EmployeeEntity;

public class CreateEmployeeHandler implements RequestHandler<EmployeeEntity, String>{
		
	private static final Logger log = LoggerFactory.getLogger(CreateEmployeeHandler.class);

	@Override
	public String handleRequest(EmployeeEntity event, Context context) {
		log.info("Received a request in your lambda  function {} with details {}", context.getFunctionName(), event);
		log.info("To String {} ", event);
		return "Employee is created successfully !";
	}
 
}
