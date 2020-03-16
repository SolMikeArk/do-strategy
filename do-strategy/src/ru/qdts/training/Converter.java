package ru.qdts.training;

import java.util.Scanner;

public class Converter {
	public static void main(String... args) {
		System.out.println("Welcome to CONVERTER!");
		System.out.println("Choose your conversion (enter the number):");
		System.out.println("[1] Celsius to Farenheit");
		System.out.println("[2] Farenheit to Celsius");
		
		int selection;
		double val;
		try(var scan = new Scanner(System.in)) {
			selection = scan.nextInt();
			System.out.println("Enter value to convert:");
			val = scan.nextDouble();
		}
		double result = Double.NaN;
		
		switch(selection) {
		case 1:
			result = Cel2Far(val);
			break;
		case 2:
			result = Far2Cel(val);
			break;
		default:
			System.out.println("You entered invalid number (");
			System.out.println("Restart program and try again");
			return;
		}
		
		System.out.println("Converted value is:");
		System.out.println(result);
		System.out.println("Thank you for using CONVERTER!");		
	}
	
	private static double Cel2Far(double val) {
		return val*9/5 + 32;
	}
	
	private static double Far2Cel(double val) {
		return (val-32)*5/9;
	}
}
