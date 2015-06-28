package ro.ase.csie.licenta.rpi.main;

import org.apache.log4j.Logger;

import ro.ase.csie.licenta.rpi.read.nfc.ReadNFC;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class);
	public static void main(String[] args) {
		try {
			Process process = ReadNFC.startConsoleProcess();
			ReadNFC.readConsoleOutput(process);
		} catch (Exception e) {
			logger.error(e);
		}
	}

}
