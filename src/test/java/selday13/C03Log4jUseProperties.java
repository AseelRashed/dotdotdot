package selday13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class C03Log4jUseProperties {

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");

        Logger logger = Logger.getLogger(C03Log4jUseProperties.class);

        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");


    }
}