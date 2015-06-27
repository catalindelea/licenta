package ro.ase.csie.licenta.rpi.util;

public class ConstantParams {
	//MQTT connection params
    public static final String TOPIC 		 = "RFID";
    public static final int QOS              = 2;
    public static final String HOST          = "tcp://192.168.1.100";
    public static final String PORT          = "1883";
    public static final String BROKER        = HOST+":"+PORT;
    public static final String CLIENT_ID     = "RPiClient";
    
    //Console process call params
    public static final String PROCESS_NAME	 ="readNFCDummy";
    public static final String PROCESS_PATH  ="/usr/bin/";
}
