package loginpractice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo2 {
	static Logger log = Logger.getLogger(Demo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("Log.properties");
		log.info("find1");
		log.warn("find2");
		log.error("find3");
		log.fatal("find5");		
	}

}
