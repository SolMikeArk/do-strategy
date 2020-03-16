package ru.qdts.training.solution2;

import java.util.Scanner;

import ru.qdts.training.solution2.Converter.ConvType;

public class ConverterRunner {
	public static void main(String... args) {
		System.out.println("Welcome to CONVERTER!");
		System.out.println("Choose your conversion (enter the number):");
		System.out.println("[1] Celsius to Farenheit");
		System.out.println("[2] Farenheit to Celsius");
		System.out.println("[3] Kilometers to Miles");
		System.out.println("[4] Miles to Kilometers");
		
		int selection;
		double val = Double.NaN;
		Converter conv = null;
		try (var scan = new Scanner(System.in)) {
			selection = scan.nextInt();
			switch (selection) {
			case 1:
				conv = Converter.getConverter(ConvType.CEL2FAR);
				break;
			case 2:
				conv = Converter.getConverter(ConvType.FAR2CEL);
				break;
			case 3:
				conv = Converter.getConverter(ConvType.KIL2MIL);
				break;
			case 4:
				conv = Converter.getConverter(ConvType.MIL2KIL);
				break;
			default:
				System.out.println("You entered invalid number (");
				System.out.println("Restart program and try again");
				return;
			}
			System.out.println("Enter value to convert:");
			val = scan.nextDouble();
		}
		catch(UnsupportedConversionExeption e) {
			System.out.println("Unsupported Conversion Type");
			e.printStackTrace();
		}
		
		
		System.out.println("Converted value is:");
		System.out.println(conv.doConversion(val)); // Use Converter with proper conversion
		System.out.println("Thank you for using CONVERTER!");		
	}

}
