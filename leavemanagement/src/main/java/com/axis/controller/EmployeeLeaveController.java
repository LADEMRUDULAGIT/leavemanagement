package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.EmployeeLeave;
import com.axis.repository.EmployeeLeaveRepository;
import com.axis.service.EmployeeLeaveService;

@RestController
@RequestMapping("/api/vi")
public class EmployeeLeaveController {
	@Autowired
	EmployeeLeaveService  employeeleaveservice;
	
	@Autowired
	EmployeeLeaveRepository employeerepository;
	
	@PostMapping("/employeeleave")
	public ResponseEntity<EmployeeLeave> addEmployeeLeave(@RequestBody EmployeeLeave empleave){
		 EmployeeLeave employeeleave=employeeleaveservice.addEmployeeLeave(empleave);
		 return new ResponseEntity<EmployeeLeave>(employeeleave,HttpStatus.OK);
	}
	@GetMapping("/employeeleaves")
	public ResponseEntity<List<EmployeeLeave>> getAllLeaves(){
		 List<EmployeeLeave> employeeleaves=employeeleaveservice.getAllEmployeeLeaves();
		 return new ResponseEntity<List<EmployeeLeave>>(employeeleaves,HttpStatus.OK);
	}
	@PutMapping("/update/employeeleave/{id}")
	public ResponseEntity<EmployeeLeave> updateEmployeeLeave(@PathVariable int id,@RequestBody EmployeeLeave empleave){
		 EmployeeLeave employeeleave=employeeleaveservice.updateEmployeeLeave(id,empleave);
		 return new ResponseEntity<EmployeeLeave>(employeeleave,HttpStatus.OK);
	}
	@DeleteMapping("/delete/employeeleave/{id}")
	public String revokeEmployeeLeave(@PathVariable int id){
		 return employeeleaveservice.deleteEmployeeLeave(id);
//		 return new ResponseEntity<EmployeeLeave>(employeeleave,HttpStatus.OK);
	}
	@GetMapping("/employeeleave/{id}")
	public ResponseEntity<EmployeeLeave> updateEmployeeLeave(@PathVariable int id){
		 EmployeeLeave employeeleave=employeeleaveservice.getEmployeeLeaveById(id);
		 return new ResponseEntity<EmployeeLeave>(employeeleave,HttpStatus.OK);
	}
	@GetMapping("/getemployeeleave/{name}")
	public ResponseEntity<List<EmployeeLeave>> getEmployeeLeaveByName(@PathVariable String name){
		return new ResponseEntity<List<EmployeeLeave>>(employeerepository.findByName(name),HttpStatus.OK);
	}
}
