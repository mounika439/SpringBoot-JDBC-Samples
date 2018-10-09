package com.springdemo.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.example.DAO.EmpDaoImpl;
import com.springdemo.example.model.Employee;
import com.springdemo.example.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpDaoImpl emp;
	
	public int save(Employee employee) {
		return emp.save(employee);
	}

	public int update(Employee employee) {
		return emp.update(employee);
	}

	public int delete(int id) {

		return emp.delete(id);
	}

	public Employee getEmpById(int id) {
		return emp.getEmpById(id);
	}

	public List<Employee> getEmployees() {
		return emp.getEmployees();
	}
}