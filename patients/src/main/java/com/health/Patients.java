package com.health;

public class Patients {
		
		private String name;
		private int age;
		private String date;
		private int temperature;
		private String symptoms;
		    
		public Patients(String name, int age, String date, int temperature, String symptoms) {
			this.name = name;
			this.age = age;
			this.date = date;
			this.temperature = temperature;
			this.symptoms = symptoms;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public int getTemperature() {
			return temperature;
		}
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}
		public String getSymptoms() {
			return symptoms;
		}
		public void setSymptoms(String symptoms) {
			this.symptoms = symptoms;
		}

		@Override
		public String toString() {
			return "Patients [name=" + name + ", age=" + age + ", date=" + date + ", temperature=" + temperature
					+ ", symptoms=" + symptoms + "]";
		}
}
