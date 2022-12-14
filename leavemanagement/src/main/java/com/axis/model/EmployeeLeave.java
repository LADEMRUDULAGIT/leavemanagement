package com.axis.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class EmployeeLeave {
	@Id
	private int Empid;
	private String name;
	private int noOfDays;
	private String leaveType;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date fromDate;
	
	public EmployeeLeave(int empid, String name, int noOfDays, String leaveType, Date fromDate) {
		super();
		Empid = empid;
		this.name = name;
		this.noOfDays = noOfDays;
		this.leaveType = leaveType;
		this.fromDate = fromDate;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public EmployeeLeave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
