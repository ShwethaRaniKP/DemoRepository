package com.sgtesting.actitime.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout extends Initialize {
	
	public static void login ()
	{
		try
		{
			
			oBrowser.findElement(By.id("username")).sendKeys("admin");;
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
			
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void logout()
	{
		try
		{			
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
						
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
