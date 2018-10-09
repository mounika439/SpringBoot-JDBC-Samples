package com.mvc.main.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	
		@RequestMapping("/showForm")
		public String showForm() {
			return "helloworld-form";
		}
			
		// need a controller method to process the HTML form
		
		@RequestMapping("/processForm")
		public String processForm() {
			return "helloworld";
		}

		
		@RequestMapping("/processFormVersionTwo")	
		public String letsShoutDude(HttpServletRequest request, Model model) {
			
			// read the request parameter from the HTML form
			String theusername = request.getParameter("username").toLowerCase();
			String thepassword = request.getParameter("password").toLowerCase();

			Map<String, String> m = new HashMap<String, String>(5);
			 m.put("tiger","tiger");
			 m.put("bob","bob"); 
			 m.put("scott","scott"); 
			 m.put("alice","alice");
			 m.put("johny","johny");
		
			 if (theusername != null && thepassword != null) {
		    	if(m.containsValue(theusername)){
		    		if(m.get(theusername) == thepassword){		    			
			  	      model.addAttribute("message", "User is authorized");
				      return "helloworld";		    			
		    		}
		    		else{
				  	      model.addAttribute("message", "Incorrect Password");
					      return "helloworld";
					    }	
		    	}
			    else{
			  	      model.addAttribute("message", "User is not authorized");
				      return "helloworld";
			    	}
			    }
			     else{	
			      model.addAttribute("message", "Please enter Details");
			      return "helloworld";
		    	}
			 
		}
		
		
		
}
