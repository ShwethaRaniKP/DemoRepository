package com.sgtesting.actitime.tests;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.Users;
import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.Projects;

public class DriverScript {

	public static void main(String[] args) {
		
		try
		{
			//Create User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Users.createUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			/*//modify user
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Users.createUser();
			Users.modifyUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Create Customer
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Customers.createCustomer();
			Customers.deleteCustomer();			
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//modify Customer
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Customers.createCustomer();
			Customers.modifyCustomer();
			Customers.deleteCustomer();			
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//CREATE project
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Customers.createCustomer();
			Projects.createProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//modify project
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Customers.createCustomer();
			Projects.createProject();
			Projects.modifyProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//create task
			
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimiZeFlyoutWindow();
			Customers.createCustomer();
			Projects.createProject();
			Tasks.createTask();
			Tasks.deleteTask();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();*/
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
