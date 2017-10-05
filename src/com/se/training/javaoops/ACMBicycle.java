package com.se.training.javaoops;

public class ACMBicycle implements BicycleInterface {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int newIncrement) {
		speed = speed + newIncrement;
	}

	public void applyBrakes(int newDecrement) {
		speed = speed - newDecrement;
	}

	public void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}

}
