package com.health;

import java.util.ArrayList;  
import java.util.List; 
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientsApplication 
{

  public static void main(String[] args) 
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

	  
      SpringApplication.run(PatientsApplication.class, args);
  }

}