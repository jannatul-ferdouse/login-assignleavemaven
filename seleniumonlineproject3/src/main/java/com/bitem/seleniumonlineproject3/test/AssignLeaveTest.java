package com.bitem.seleniumonlineproject3.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitem.seleniumonlineproject3.Utils.Drivermanager;
import com.bitem.seleniumonlineproject3.Utils.UrltextUtils;
import com.bitem.seleniumonlineproject3.Utils.XpathUtils;



public class AssignLeaveTest {
	
	private WebDriver driver = null;

	
    @Test
    public void leavepagetitleverify()
    {
	
	   driver=Drivermanager.driver;
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.AssignLeavemodule.assignleavebtn)));
	  driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.assignleavebtn)).click();
	  driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.employeename)).sendKeys("Odis Adalwin");

	  
	  
	  Select Leavetype = new Select(driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.leavetype)));
      
      Leavetype.selectByVisibleText("US - Personal");
      
      
      
      driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.fromdate)).click();
		driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.fromdate)).sendKeys("2020-12-13");
		
		
	     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input")).clear();
	     driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.todate)).clear();
		driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.todate)).click();
		driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.todate)).sendKeys("2020-12-15");
		
		
		
		driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.comment)).sendKeys("testcases");
		driver.findElement(By.xpath(XpathUtils.AssignLeavemodule.assignbtn)).click();
	
     
	  
	  
	  
	  
     }

	
	
	
	
	
	
   
	
	
	
	
	

}
