package com.mvc.main.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mvc.main.DAO.EmpDaoImpl;
import com.mvc.main.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	EmpDaoImpl emp;
	
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
