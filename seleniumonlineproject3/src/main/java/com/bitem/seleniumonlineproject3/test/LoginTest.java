package com.bitem.seleniumonlineproject3.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitem.seleniumonlineproject3.Utils.Drivermanager;
import com.bitem.seleniumonlineproject3.Utils.UrltextUtils;
import com.bitem.seleniumonlineproject3.Utils.UrltextUtils.Url;
import com.bitem.seleniumonlineproject3.Utils.XpathUtils;


public class LoginTest {

private WebDriver driver = null;

      @Test
      public void homepagetitleverify()
      {
	
	   driver=Drivermanager.driver;
	   driver.get(UrltextUtils.Url.baseUrl);
       Assert.assertEquals(driver.getTitle(), UrltextUtils.Text.homebaseTitle);


       }


      @Test(dependsOnMethods  = "homepagetitleverify")
      public void logintest()
      {

	  
	   driver.findElement(By.xpath(XpathUtils.Loginmodule.username)).sendKeys("Admin");
	   driver.findElement(By.xpath(XpathUtils.Loginmodule.password)).sendKeys("admin123");
	   driver.findElement(By.id(XpathUtils.Loginmodule.loginBtn)).click();
       System.out.println("logged in successfully");


	}
}