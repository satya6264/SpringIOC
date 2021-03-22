package com.vidvaan.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidvaan.crud.dao.AddressDAO;
import com.vidvaan.crud.dao.DepartmentDAO;
import com.vidvaan.crud.dao.EmployeeDAO;
import com.vidvaan.crud.dao.ManagerDAO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private DepartmentDAO departmentDAO;
	@Autowired
	private ManagerDAO managerDAO;
	
	

//	public EmployeeService() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public EmployeeService(EmployeeDAO employeeDAO, AddressDAO addressDAO, DepartmentDAO departmentDAO,
//			ManagerDAO managerDAO) {
//		super();
//		this.employeeDAO = employeeDAO;
//		this.addressDAO = addressDAO;
//		this.departmentDAO = departmentDAO;
//		this.managerDAO = managerDAO;
//	}
//
//	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
//		this.employeeDAO = employeeDAO;
//	}
//
//	public void setAddressDAO(AddressDAO addressDAO) {
//		this.addressDAO = addressDAO;
//	}
//
//	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
//		this.departmentDAO = departmentDAO;
//	}
//
//	public void setManagerDAO(ManagerDAO managerDAO) {
//		this.managerDAO = managerDAO;
//	}

	public void save() {

		System.out.println("Employee Service Save Called...");
		employeeDAO.save();
		addressDAO.save();
		departmentDAO.save();
		managerDAO.save();
	}

}
