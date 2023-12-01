package Logging.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log=LogManager.getLogger("LoggerDemo");
		System.out.println("This is a logger demo");
		
		log.info("for info only");
		log.fatal("for fatal only");
	}

}
