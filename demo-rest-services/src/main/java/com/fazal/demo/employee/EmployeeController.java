package com.fazal.demo.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fazal.demo.entity.Employee;

@RestController
public class EmployeeController {

	List<Employee> list = new ArrayList<>();

	@GetMapping("/employees")
	List<Employee> all() {
		return list;
	}

	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		list.add(newEmployee);
		return newEmployee;
	}

	@GetMapping("/employees/{id}")
	Employee one(@PathVariable Long id) {

		return new Employee();
	}

	@PutMapping("/employees/{id}")
	Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

		return new Employee();
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {

	}

}
