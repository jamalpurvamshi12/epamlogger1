package logger.logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info("HELLO WORLD !!!");
        LOGGER.debug("This is a Debug Logger");
        LOGGER.warn("This is a  warn Logger");
        LOGGER.error("This is a error Logger");
        LOGGER.fatal("This is a fatal Logger");
        
    }
}
