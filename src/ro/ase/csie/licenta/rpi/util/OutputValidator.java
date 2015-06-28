package ro.ase.csie.licenta.rpi.util;

import org.apache.log4j.Logger;

import ro.ase.csie.licenta.rpi.read.nfc.ReadNFC;

public class OutputValidator {
	private static Logger logger = Logger.getLogger(ReadNFC.class);
	public static boolean isValid(String output) {
		boolean result=true;
		if (output.length()!=8) result = false;
		try {
			Integer.parseInt(output);
		} catch (Exception e) {
			result = false;
			logger.error(e);
		}
		return result;
	}
}
