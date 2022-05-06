package BroweserOperations;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBroweser {
	
	
	public static void main(String[] args) {
		
		//String path2= ".drivers/geckodriver";
		
		String path3 = System.getProperty("user.dir") + "/drivers/geckodriver";
		
		
		System.setProperty("webdriver.gecko.driver",path3);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.close();
				
		
				
				
				
				
		
		
		
	}

}
