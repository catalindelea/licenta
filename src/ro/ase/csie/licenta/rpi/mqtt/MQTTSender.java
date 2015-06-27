package ro.ase.csie.licenta.rpi.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import static ro.ase.csie.licenta.rpi.util.ConstantParams.*;

public class MQTTSender {

	public static void sendMqttMessage(String output) {
		MemoryPersistence persistence = new MemoryPersistence();
		try {
            MqttClient client = new MqttClient(BROKER, CLIENT_ID, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            connOpts.setKeepAliveInterval(2000000);
            client.connect(connOpts);
//            System.out.println("Publishing message: "+output);
            MqttMessage message = new MqttMessage(output.getBytes());
            message.setQos(QOS);
            client.publish(TOPIC, message);
            client.disconnect();
        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
	}

}
