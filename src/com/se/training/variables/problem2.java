package com.se.training.variables;

public class problem2 {

	
		
		int cadence;
	    int speed;
	    int gear;

	    void changeCadence(int newValue) {
	         cadence = newValue;
	    }

	    void changeGear(int newValue) {
	         gear = newValue;
	    }

	    void speedUp(int increment) {
	         speed = speed + increment;   
	    }

	    void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	    void printStates() {
	         System.out.println("cadence:" +
	             cadence + " speed:" + 
	             speed + " gear:" + gear);

	}

}
