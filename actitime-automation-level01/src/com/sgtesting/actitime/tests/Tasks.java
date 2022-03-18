package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Tasks extends Initialize{

		public static void createTask()
		{
			try
			{	//select project
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
				Thread.sleep(3000);
				
				//select add new task button
				oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
				Thread.sleep(3000);
				
				//select create new task option
				oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
				Thread.sleep(3000);
				
				//create task1,send task name as task1
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
				Thread.sleep(3000);
				
				//create task2,send task name as task2.
				oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).sendKeys("Task2");
				Thread.sleep(3000);
				
				//click on create task button
				oBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
				Thread.sleep(5000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		public static void deleteTask()
		{
			try
			{
				//select project
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
				Thread.sleep(3000);
				
				//click on select task box
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")).click();
				Thread.sleep(3000);
				
				//delete button
				oBrowser.findElement(By.xpath("//span[text()='Delete']")).click();
				//[@id="taskListBlock"]/div[1]/div[3]/div/div/div[4]/span
				Thread.sleep(3000);
				
				//delete permanently
				oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
				Thread.sleep(3000);
				
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}


