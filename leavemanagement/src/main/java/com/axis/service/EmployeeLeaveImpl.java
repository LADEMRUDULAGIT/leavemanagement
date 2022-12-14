package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.IDNotFoundException;
import com.axis.model.EmployeeLeave;
import com.axis.repository.EmployeeLeaveRepository;
import com.axis.utils.AppConstants;

@Service
public class EmployeeLeaveImpl implements EmployeeLeaveService {

	@Autowired
	EmployeeLeaveRepository employeerepository;
	@Override
	public EmployeeLeave addEmployeeLeave(EmployeeLeave employeeleave) {
		// TODO Auto-generated method stub
		return this.employeerepository.save(employeeleave);
		//return null;
	}

	@Override
	public List<EmployeeLeave> getAllEmployeeLeaves() {
		// TODO Auto-generated method stub
		//return null;
		return this.employeerepository.findAll();
	}

	@Override
	public EmployeeLeave updateEmployeeLeave(int id,EmployeeLeave employeeleave) {
		// TODO Auto-generated method stub
		//return null;
		 EmployeeLeave empleave =employeerepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.ID_NOT_FOUND));
		empleave.setEmpid(employeeleave.getEmpid());
		 empleave.setLeaveType(employeeleave.getLeaveType());
		empleave.setFromDate(employeeleave.getFromDate());
		empleave.setName(employeeleave.getName());

		return this.employeerepository.save(empleave);
	}

	@Override
	public String deleteEmployeeLeave(int id) {
		// TODO Auto-generated method stub
		 EmployeeLeave empleave =employeerepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.ID_NOT_FOUND));
		employeerepository.delete(empleave);
		return "Revoked leave Successfully";
	}

	@Override
	public EmployeeLeave getEmployeeLeaveById(int id) {
		EmployeeLeave empleave =employeerepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.ID_NOT_FOUND));
		return empleave;
	}

//	@Override
//	public Optional<EmployeeLeave> getEmployeeLeaveByName(String name) {
//		Optional<EmployeeLeave> empleave =employeerepository.findByName(name);
//		return empleave;
//	}

	

	

}
