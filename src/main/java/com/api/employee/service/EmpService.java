package com.api.employee.service;





import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.employee.Repository.EmpRepository;
import com.api.employee.beans.Emp;

@Service
public class EmpService {
	
@Autowired
EmpRepository repo;

	
	public HashMap<Integer, Emp> getEmployees() {
				
		return repo.getEmployees();		
	}
	
	
   public Emp getEmployeeById( int id) {//this is just to test autowiring
	
	   Emp employee = repo.getEmployees().get(id);	   
	   return employee;
		
	}
   
   
   public void saveEmployee(Emp emp) {
		
	   
	   int id = repo.getEmployees().size();
	   emp.setId(++id);
	   repo.getEmployees().put(id, emp);
	   System.out.println("New size after saving is "+repo.getEmployees().size());
	}
   
   
 public void editEmployee(Emp empUI) {
		 
	 repo.getEmployees().put(empUI.getId(), empUI);
	}
 
 
 public void deleteEmployee(Emp empUI) {
	  
	   repo.getEmployees().remove(empUI.getId());
	   System.out.println("Employee is successfully deleted");
	   
	}
 
 
 public void printAllEmployees() {
	repo.printAllEmployees();	
}

}
