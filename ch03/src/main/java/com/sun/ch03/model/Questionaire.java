package com.sun.ch03.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Questionaire {

	private Participant_basic_information pbi = null ; 
	
	public float getHeight() { return this.pbi.height ; }
	public float getWeight() { return this.pbi.weight ; }
	public float getAge() { return this.pbi.age ; }
	public float getBlood_pressure() { return this.pbi.blood_pressure ; }
	
	private static class Participant_basic_information {
		private float height ;
		private float weight ;
		private float age ;
		private float blood_pressure ;
		
		public Participant_basic_information(String height, String weight, String age, String blood_pressure) {
			this.height = Float.parseFloat(height) ;
			this.weight = Float.parseFloat(weight) ;
			this.age = Float.parseFloat(age) ;
			this.blood_pressure = Float.parseFloat(blood_pressure) ;
		}
	}

	public Questionaire(String height, String weight, String age, String blood_pressure) {
		this.pbi = new Participant_basic_information(height, weight, age, blood_pressure) ;
	}
}














