package logger.logger;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost 
{
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCost.class);
	
	public ConstructionCost()
	{
		
		
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Calculating TOTal Construction Cost\n");
		LOGGER.info("Enter the material Standard\n");
		LOGGER.info("Enter \n1--> standard materials\n");
		LOGGER.info("2--> above standard materials\n");
		LOGGER.info("3--> high standard materials\n");
		LOGGER.info("4--> high  standard materials and fully automated home\n");
		int material_choice=sc.nextInt();
		LOGGER.info("Enter the total area of the house in sq.ft\n");
		int total_area=sc.nextInt();
		double total_cost=0,cost=0;
		switch(material_choice)
		{
		case 1:
			cost=1200;
			break;
		case 2:
			cost=1500;
			break;
		case 3:
			cost=1800;
			break;
		case 4:
			cost=2500;
			break;	
			
			
		}
		
		total_cost=total_area*cost;
		LOGGER.info("Total Cost of Construction = "+total_cost);
		System.exit(0);
	}
}
