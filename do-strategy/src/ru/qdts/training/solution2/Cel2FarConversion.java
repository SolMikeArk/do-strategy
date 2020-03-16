package ru.qdts.training.solution2;

public class Cel2FarConversion implements Conversion {
	public double convert(double value) {
		return value*9/5 + 32;
	}
}
