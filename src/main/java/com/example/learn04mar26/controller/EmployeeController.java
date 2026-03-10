package com.example.learn04mar26.controller;

import com.example.learn04mar26.model.Employee;
import com.example.learn04mar26.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
     @GetMapping("/test")
	public String testApi(){
	return "Jenkins Pipeline working";
   }
}

