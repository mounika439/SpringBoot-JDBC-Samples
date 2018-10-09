package com.mvc.main.DAO;

import java.util.List;

import com.mvc.main.model.Employee;

public interface EmpDAO {
	
	public int save(Employee employee);
	public int update(Employee employee);
	public int delete(int id);
	public Employee getEmpById(int id);  
	public List<Employee> getEmployees(); 

}
