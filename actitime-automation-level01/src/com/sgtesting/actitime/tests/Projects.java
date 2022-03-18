package com.sgtesting.actitime.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projects extends Initialize {
	
	public static void createProject()
	{			
		try 
		{
			//tasks
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			
			//add new
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			
			//new project
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			
			//project creation window
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			Thread.sleep(2000);
			
			//select down button
			oBrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/table/tbody/tr/td[2]/em")).click();
			Thread.sleep(2000);
			
			//allocation of project to customer
		//	oBrowser.findElement(By.xpath("/html/body/div[25]/ul/li[4]/a")).click();
		//	Thread.sleep(2000);
			
			//project description area
			oBrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div/div/div[1]/textarea")).sendKeys("This project is assigned to demo customer");
			Thread.sleep(2000);
			
			//project creation confirmation button
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
			
						
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	public static void modifyProject()
	{
		try
		{	
			//settings button on project
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			
			//down button in status menu
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div")).click();
			Thread.sleep(4000);
			
			//modify to archived
			oBrowser.findElement(By.xpath("/html/body/div[28]/div[2]/div")).click();
			Thread.sleep(3000);
			
			//close button
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void deleteProject()
	{
		try
		{
			//settings button in
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(3000);
			
			//actions button
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
		Thread.sleep(3000);
		
		//delete operation
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")).click();
		Thread.sleep(3000);
		
		//confirm deletion
		oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(2000);
		
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
