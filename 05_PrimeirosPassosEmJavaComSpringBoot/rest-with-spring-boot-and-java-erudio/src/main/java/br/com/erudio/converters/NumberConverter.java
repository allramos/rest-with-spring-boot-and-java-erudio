package br.com.erudio.converters;

public class NumberConverter {
	
	public static Double convertToDouble(String n) {
		if (n == null)
			return 0D;
		String number = n.replaceAll(",",".");
		if(isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String n) {
		if (n == null)
			return false;
		String number = n.replaceAll(",",".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
