package loginpractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {
	static Logger log = Logger.getLogger(Demo.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("find1");
		log.warn("find2");
		log.error("find3");
		log.debug("find4");
		log.fatal("find5");		
	}
}
