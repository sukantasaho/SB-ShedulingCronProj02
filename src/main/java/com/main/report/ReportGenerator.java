package com.main.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("saleReport")
public class ReportGenerator 
{
     
	             //Task will be executed for every 15 seconds in a minute 
					/*@Scheduled(cron = "15 * * * * *")
					 public void generateSalesReport1()
					 {
					     System.out.println("Sales report is generated every 15sec of a minute::"+new Date());
					 }*/
	
	           //Task will be executed for every 1 minutes an hour
				/*@Scheduled(cron = "0 1 * * * *")
				public void generateSalesReport2()
				{
				    System.out.println("Sales report is generated every 1min of an hour::"+new Date());
				}
				
				//Task will be executed for every 2 minutes 10sec an hour
				@Scheduled(cron = "10 2 * * * *")
				public void generateSalesReport3()
				{
				System.out.println("Sales report is generated every 2min and 10sec of an hour::"+new Date());
				}
				
				//Task will be executed for every Day 1PM
				@Scheduled(cron = "0 0 13 * * *")
				public void generateSalesReport4()
				{
				System.out.println("Sales report is generated every day at 1PM::"+new Date());
				}
				
				//Task will be executed for every Day 1PM 30min
				@Scheduled(cron = "0 30 13 * * *")
				public void generateSalesReport5()
				{
				System.out.println("Sales report is generated every day at 1PM 30MIN::"+new Date());
				}
				
				//Task will be executed for every 20 and 30 min an hour
				@Scheduled(cron = "0 20,30 * * * *")
				public void generateSalesReport6()
				{
				System.out.println("Sales report is generated every 20 and 30 min an hour::"+new Date());
				}
				
				//Task will be executed for every day at 1:30PM and 2:30PM
				@Scheduled(cron = "0 30 13,14 * * *")
				public void generateSalesReport7()
				{
				System.out.println("Sales report is generated every day at 1:30PM and 2:30PM::"+new Date());
				}
				
				//Task will be executed for every day at 1:50PM,2:50PM,3:50PM,4:50PM
				@Scheduled(cron = "0 50 13-16 * * *")
				public void generateSalesReport8()
				{
				System.out.println("Sales report is generated every day at 1:50PM,2:50PM,3:50PM,4:50PM::"+new Date());
				}
				
				//Task will be executed for every month 25th 2:45:10PM
				@Scheduled(cron = "10 45 14 25 * *")
				public void generateSalesReport9()
				{
				System.out.println("Sales report is generated every month 25th 2:45:10PM::"+new Date());
				}*/
				
				//Task will be executed for every month Dec 25th 2:52PM
				/*@Scheduled(cron = "0 58 14 25 12 *")
				public void generateSalesReport10()
				{
					System.out.println("Sales report is generated every  month Dec 25th 2:52PM::"+new Date());
				}
				
				
				//Task will be executed 20sec for every minute at 3PM
				@Scheduled(cron = "20 * 15 * * *")
				public void generateSalesReport11()
				{
					System.out.println("Task will be executed 20sec for every minute at 3PM::"+new Date());
				}
				
				//Task will be executed every month of sunday at 10AM
				@Scheduled(cron = "0 0 10 * * SUN")
				public void generateSalesReport12()
				{
					System.out.println("Task will be executed 20sec for every minute at 3PM::"+new Date());
				}*/
	
	 
	
}
