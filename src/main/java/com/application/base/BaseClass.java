package com.application.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.application.actiondriver.Action;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  static WebDriver driver;
	public  static Properties prop;
	
	public static void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browsername= prop.getProperty("browser");
		if(browsername.contains("Chrome")){
			driver= new ChromeDriver();
			
		}
		if(browsername.contains("FieFox")){
			driver= new FirefoxDriver();
			
		}
		Action.implicitWait(driver,10);
		Action.pageLoadTimeOut(driver,30);
		driver.get(prop.getProperty("url"));
		
				
	}
	
	
	
	        @BeforeTest
			public void readconfig() {
				 prop =new Properties();
				try {
					FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"E/java project workspace/application/Configuration");
					prop.load(fs);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
	
	
		}
		
		
	
	
	
	

		
		
	
	


