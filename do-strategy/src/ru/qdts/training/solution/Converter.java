package ru.qdts.training.solution;

import java.util.Scanner;

public class Converter {
	public static void main(String... args) {
		System.out.println("Welcome to CONVERTER!");
		System.out.println("Choose your conversion (enter the number):");
		System.out.println("[1] Celsius to Farenheit");
		System.out.println("[2] Farenheit to Celsius");
		System.out.println("[3] Kilometers to Miles");
		System.out.println("[4] Miles to Kilometers");
		
		int selection;
		double val;
		Conversion conv = null;
		try(var scan = new Scanner(System.in)) {
			selection = scan.nextInt();
			System.out.println("Enter value to convert:");
			val = scan.nextDouble();
		}
				
		switch(selection) {
		case 1:
			conv = new Cel2FarConversion();
			break;
		case 2:
			conv = new Far2CelConversion();
			break;
		case 3:
			conv = new Kil2MilConversion();
			break;
		case 4:
			conv = new Mil2KilConversion();
			break;
		default:
			System.out.println("You entered invalid number (");
			System.out.println("Restart program and try again");
			return;
		}
		
		System.out.println("Converted value is:");
		System.out.println(conv.convert(val)); // Works for all types of conversion because of polymorphism
		System.out.println("Thank you for using CONVERTER!");		
	}

}
