package ro.ase.csie.licenta.rpi.util;

public class OutputValidator {
	public static boolean isValid(String output) {
		boolean result=true;
		if (output.length()!=8) result = false;
		try {
			Integer.parseInt(output);
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
}
