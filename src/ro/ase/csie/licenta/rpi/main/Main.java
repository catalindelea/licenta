package ro.ase.csie.licenta.rpi.main;

import ro.ase.csie.licenta.rpi.read.nfc.ReadNFC;

public class Main {

	public static void main(String[] args) {
		try {
			Process process = ReadNFC.startConsoleProcess();
			ReadNFC.readConsoleOutput(process);
			
//			ReadNFC.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
