package ru.qdts.training.solution2;

public class Far2CelConversion implements Conversion {
	public double convert(double value) {
		return (value-32)*5/9;
	}
}
