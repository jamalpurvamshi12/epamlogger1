package logger.logger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sici
{  
	
	private static final Logger LOGGER=LogManager.getLogger(Sici.class);
	
	public Sici()
	{

	Scanner sc=new Scanner(System.in);
	Double principle_amount,rate,time,simple_interest,compund_interest;
	LOGGER.info("Calculating Simple and Compund Interest\n");
	LOGGER.info("Enter the principle Amount\n");
	principle_amount=sc.nextDouble();
	
	LOGGER.info("Enter the Time\n");
    time=sc.nextDouble();
	
    LOGGER.info("Enter the Rate\n");
    rate=sc.nextDouble();
    
    simple_interest=((principle_amount*time*rate)/100);
    
    LOGGER.info("simple interest ="+simple_interest+"\n");
    
    compund_interest=principle_amount*(Math.pow((1+rate/100),time));
    
    LOGGER.info("compound interest="+compund_interest+"\n");
    
    System.exit(0);
	}

}
