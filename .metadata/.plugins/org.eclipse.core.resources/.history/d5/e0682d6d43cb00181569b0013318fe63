package com.springdemo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.example.DAO.EmpDaoImpl;
import com.springdemo.example.model.Employee;

@RestController
public class Controller {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView getView() {
		ModelAndView m = new ModelAndView("hellos");
		m.addObject("hellos", "form controller");
		return m;
		
	}
	
	 @Autowired  
	 EmpDaoImpl dao;
	 
    @RequestMapping("/empform")  
    public ModelAndView showform(){  
        return new ModelAndView("empform","command",new Employee());  
    } 
    
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("emp") Employee emp){  
        dao.save(emp);  
        return new ModelAndView("redirect:/viewemp"); 
    }  
    
    
    @RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        List<Employee> list=dao.getEmployees();  
        return new ModelAndView("viewemp","list",list);  
    }  
    

    @RequestMapping(value="/editemp/{id}")  
    public ModelAndView edit(@PathVariable int id){  
    	Employee employee=dao.getEmpById(id);  
        return new ModelAndView("empeditform","command",employee);  
    } 
    
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("employee") Employee employee){  
        dao.update(employee);  
        return new ModelAndView("redirect:/viewemp");  
    } 
    
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable int id){  
        dao.delete(id);  
        return new ModelAndView("redirect:/viewemp");  
    } 
	
	
}
