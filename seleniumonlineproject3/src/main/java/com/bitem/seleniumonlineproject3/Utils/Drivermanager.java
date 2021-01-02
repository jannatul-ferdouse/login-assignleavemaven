package com.bitem.seleniumonlineproject3.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Drivermanager {
	
	static{System.setProperty("webdriver.chrome.driver", "F:\\Software testing\\bitem\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
	}
	public static WebDriver driver = new ChromeDriver();
	Drivermanager()
	{
		
		
	}
}