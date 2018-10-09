package com.springdemo.example.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springdemo.example.DAO.EmpDAO;
import com.springdemo.example.model.Employee;

@Repository
public class EmpDaoImpl implements EmpDAO{

    @Autowired
	JdbcTemplate template;  

	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 
	
	public int save(Employee employee) {
		String sql="insert into Employee (firstname,lastname,salary) "
				+ "values('"+employee.getFirstName()+"','"+employee.getLastName()+"',"+employee.getSalary()+")";  
		return template.update(sql);  
	}

	public int update(Employee employee) {
		    String sql="update Employee set firstname='"+employee.getFirstName()+"', lastname='"+employee.getLastName()+"'"
		    		+ " ,salary='"+employee.getSalary()+"' where id="+employee.getId()+"";  
		    return template.update(sql);  
		}

	public int delete(int id) {
		  String sql="delete from Employee where id="+id+"";  
		    return template.update(sql);  
	}

	public Employee getEmpById(int id) {
	    String sql="select * from Employee where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
	}

	public List<Employee> getEmployees() {
		   return template.query("select * from Employee",new RowMapper<Employee>(){  
		        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
		        	Employee e= new Employee(); 
		        	e.setId(rs.getInt(1));
		            e.setFirstName(rs.getString(2));  
		            e.setLastName(rs.getString(3));  
		            e.setSalary(rs.getDouble(4));  
		            return e;  
		        }  
		   });  	
		   
	}

}
