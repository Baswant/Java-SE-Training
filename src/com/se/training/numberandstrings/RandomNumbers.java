package com.se.training.numberandstrings;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random dice = new Random();
		
		int Number ;
		
		for(int counter=1; counter<=10; counter++)
		{
			Number = 1+dice.nextInt(6);
			System.out.println(+Number);
		}
	}

}
