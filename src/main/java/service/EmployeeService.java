package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeService {
	Hashtable<String,Employee> employees = new Hashtable<String,Employee>();
	public EmployeeService() {
		Employee em = new Employee();
		em.setId("1");
		em.setFirstName("Nitish");
		em.setLastName("Panday");
		em.setAge(24);
		employees.put("1", em);
		
		em = new Employee();
		em.setId("2");
		em.setFirstName("Hello");
		em.setLastName("Brother");
		em.setAge(99);
		employees.put("2", em);
	}
	
	public Employee getEmployee(String id) {
		if(employees.containsKey(id))
			return employees.get(id);
		else 
			return null;
	}
	
	public Hashtable<String,Employee> getAll(){
		return employees;
	}
}
