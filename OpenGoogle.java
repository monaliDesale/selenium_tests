package BroweserOperations;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
  
  //step-2 create an instance of required browser
  
  WebDriver driver = new FirefoxDriver();
  
//enter google url
  driver.get("https://www.google.com/");
  
//Get current page source code and print the length in the console 
  
  String sourcecode= driver.getPageSource();
  
  System.out.println("Application source code: " + sourcecode);
  System.out.println("Source code length: "+sourcecode.length());
  
//Get current url from the application and print in the console 
		System.out.println("Application current URL: " + driver.getCurrentUrl());
		
		//Get current page title and print in the console 
				System.out.println("Application current Title: " + driver.getTitle());
				
				
				if(driver.getTitle().equals("Google")) {
					System.out.println("Google search page opened successfully...");
				}else {
					System.out.println("Either google search page not opened or its title got changed");
				}
				//close current instance of browser
				driver.close();
  
	}

}
//testing my commit
