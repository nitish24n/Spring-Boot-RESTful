package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeControlller {
	@Autowired
	EmployeeService emp;
	
	@GetMapping("/welcome")
	public String welcome(){
		return "Hello Man ... How's the life Going on";
	}
	
	@GetMapping("/all")
	public Hashtable<String,Employee> getAll() {
		return emp.getAll();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") String id) {
		return emp.getEmployee(id);
	}
	
	@PostMapping("/ViewBio/{luckyNo}")
	public String showBio(@RequestBody Employee empl,@PathVariable("luckyNo") Integer num) {
		System.out.println("Inside ViewBio ----!!");
		return "Hello"+empl.getFirstName()+" ! "+"You are "+empl.getAge()+" years old . Your lucky number is :"+num;
	}
} 