package ro.ase.csie.licenta.rpi.read.nfc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import static ro.ase.csie.licenta.rpi.util.ConstantParams.*;

public class ReadNFC {
	public static Process startConsoleProcess() throws Exception {
		File f = new File(PROCESS_NAME);
		if (!f.exists())
			throw new FileNotFoundException();
		return Runtime.getRuntime().exec("./" + PROCESS_NAME);
	}

	public static void readConsoleOutput(Process process) throws InterruptedException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String output;
		try {
			while (true) {
				output = reader.readLine();
				if (output != null) {
					ParseOutput.CheckSend(output);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
