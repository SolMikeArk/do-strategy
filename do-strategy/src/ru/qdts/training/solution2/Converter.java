package ru.qdts.training.solution2;

public class Converter {
	enum ConvType {ECHO, CEL2FAR, FAR2CEL, KIL2MIL, MIL2KIL}
	private Conversion conv;
	
	protected Converter() {
		this(new EchoConversion());
	}
	
	protected Converter(Conversion conv) {
		this.conv = conv;
	}
	
	public static Converter getConverter(ConvType type) throws UnsupportedConversionExeption {
		Conversion conv = null;
		switch(type) {
		case CEL2FAR:
			conv = new Cel2FarConversion();
			break;
		case FAR2CEL:
			conv = new Far2CelConversion();
			break;
		case KIL2MIL:
			conv = new Kil2MilConversion();
			break;
		case MIL2KIL:
			conv = new Mil2KilConversion();
			break;
		default:
			throw new UnsupportedConversionExeption();
		}
		return new Converter(conv);
	}
	
	public double doConversion(double value) {
		return conv.convert(value);
	}

}
