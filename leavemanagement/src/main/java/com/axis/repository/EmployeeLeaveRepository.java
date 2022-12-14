package com.axis.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.model.EmployeeLeave;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, Integer>{

	List<EmployeeLeave> findByName(String name);

//	Optional<EmployeeLeave> findByName(String name);

	

	//Optional<EmployeeLeave> findByName(String name);
//	public String deleteEmployeeLeave(String EmployeeName);

  // public EmployeeLeave findByEmployeeName(String employeeName);
}
