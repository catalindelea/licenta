package ro.ase.csie.licenta.rpi.read.nfc;

import ro.ase.csie.licenta.rpi.mqtt.MQTTSender;
import ro.ase.csie.licenta.rpi.util.OutputValidator;

public class ParseOutput {

	public static void CheckSend(String output) {
		if (OutputValidator.isValid(output))
			MQTTSender.sendMqttMessage(output);
	}
}
