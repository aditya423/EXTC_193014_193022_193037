package com.health;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientsController 
{

	  @GetMapping("/Patients-json")
	  @ResponseBody
	  public Patients displayBill(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) 
	  {       
		  List<Patients> al = new ArrayList<>(); 
		  
		  Patients obj1 = new Patients("Aditya Ghadge", 26, "23rd March 2020", 38, "Fever");
		  Patients obj2 = new Patients("Jordan D'souza", 50, "1st January 2020", 34, "Shortness of breath");
		  Patients obj3 = new Patients("Shrirang Joshi", 60, "17th October 2019", 34, "Headache");
		  Patients obj4 = new Patients("Madhura Kamat", 18, "8th March 2020", 34, "Cough");
		  Patients obj5 = new Patients("Aakash Annadate", 90, "31st December 2019", 34, " vomiting");
		  Patients obj6 = new Patients("Shreya Ghosh", 75, "15th July 2020", 36, "Muscle or body aches");
		  
		  al.add(obj1); 
	      al.add(obj2); 
	      al.add(obj3); 
	      al.add(obj4); 
	      al.add(obj5); 
	      al.add(obj6);
	      
		  return obj1;
	 }
	  
	   @GetMapping("/Patients-html")
	    public ModelAndView htmlView(Model model)
	  {    
		
		   List<Patients> al = new ArrayList<>(); 
			  
		   Patients obj1 = new Patients("Aditya Ghadge", 26, "23rd March 2020", 38, "Fever");
		   Patients obj2 = new Patients("Jordan D'souza", 50, "1st January 2020", 34, "Shortness of breath");
		   Patients obj3 = new Patients("Shrirang Joshi", 60, "17th October 2019", 34, "Headache");
		   Patients obj4 = new Patients("Madhura Kamat", 18, "8th March 2020", 34, "Cough");
		   Patients obj5 = new Patients("Aakash Annadate", 90, "31st December 2019", 34, " vomiting");
		   Patients obj6 = new Patients("Shreya Ghosh", 75, "15th July 2020", 36, "Muscle or body aches");
			    
		   al.add(obj1); 
		   al.add(obj2); 
		   al.add(obj3); 
    	   al.add(obj4); 
           al.add(obj5); 
		   al.add(obj6);
			  
	       ModelAndView mav = new ModelAndView();
	       mav.addObject("first", obj1);
	       mav.addObject("second", obj2);
	       mav.addObject("third", obj3);
	       mav.addObject("fourth", obj4);
	       mav.addObject("fifth", obj5);
	       mav.addObject("sixth", obj6);
	       mav.setViewName("index");   
	       return mav;
	  } 
}
