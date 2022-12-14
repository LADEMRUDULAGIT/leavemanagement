package com.axis.service;

import java.util.List;
import java.util.Optional;

import com.axis.model.EmployeeLeave;

public interface EmployeeLeaveService {
	public EmployeeLeave addEmployeeLeave(EmployeeLeave employeeleave);
	public List<EmployeeLeave> getAllEmployeeLeaves();
	public EmployeeLeave updateEmployeeLeave(int id,EmployeeLeave employeeleave);
    public String deleteEmployeeLeave(int id);
    public EmployeeLeave getEmployeeLeaveById(int id);
//    public Optional<EmployeeLeave> getEmployeeLeaveByName(String name);
}
