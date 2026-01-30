package Extent_pack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_demo {
private static Logger logger= LogManager.getLogger()
public static void main(String args[]) {
	System.out.println("hello world");
	logger.info("this is a information message");
	logger.trace(null, null, args, args, args, args, args, args, args, args);
}
}
