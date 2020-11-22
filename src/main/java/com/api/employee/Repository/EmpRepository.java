package com.api.employee.Repository;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.api.employee.beans.Emp;


@Repository
public class EmpRepository {
	
	
	
	public static HashMap<Integer, Emp> employeeMap = null;//acting as DB
	

	static {
		
		 employeeMap = new HashMap<Integer, Emp>();
		 int id=0;
		
		 employeeMap.put(++id, new Emp( id, "Bryan", 155000, "Dev"));
     	 employeeMap.put(++id, new Emp( id, "Bryan", 155000, "Dev"));
		 employeeMap.put(++id, new Emp( id, "Charles", 175000, "Lead"));
		 employeeMap.put(++id, new Emp( id, "Donald", 100000, "BA"));
		 employeeMap.put(++id, new Emp( id, "Trump", 200000, "Genitor"));		
		
	}
	

	public HashMap<Integer, Emp> getEmployees() {
				
		return employeeMap;		
	}
	
	public void printAllEmployees() {
		 Iterator it = employeeMap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        
		    }
		
	}
	

}
