package com.api.common;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.api.employee.beans.Emp;
import com.api.employee.service.EmpService;

	public class MainApp {
	/*
	 * This class is only for testing the functionality and Spring nature of this module. 
	 * This method wont be executed in prod env. This is a child module (API) and will be  used by other modules like WS and web app
	 * This project is standalone spring app. It is not Web app	
	 */
	  
		
		
		public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("HRSystemAPI-context.xml");
	        
	       
	         EmpService empService = (EmpService)context.getBean("empService");//cant autowire this bean in this class
			empService.printAllEmployees();
			System.out.println(" ***********Deepti cook saving");
			Emp emp = new Emp("Deepti", 155000, "cook");
			empService.saveEmployee(emp);
			
			empService.printAllEmployees();
			emp.setDesignation("Manager");
			System.out.println(" ***********Deepti Manager saving");
			empService.editEmployee(emp);
			empService.printAllEmployees();
			System.out.println(" ***********Deepti Deleting");
			empService.deleteEmployee(emp);
			empService.printAllEmployees();
			System.out.println(" ***********Deepti saving again");
			empService.saveEmployee(emp);
			empService.printAllEmployees();
		}
	   
	}



