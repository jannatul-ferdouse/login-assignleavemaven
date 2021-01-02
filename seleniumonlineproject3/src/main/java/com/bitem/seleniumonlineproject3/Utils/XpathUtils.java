package com.bitem.seleniumonlineproject3.Utils;

public class XpathUtils {
	public static class Loginmodule{
		
		public static final String username="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input";
		public static final String password="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input";
		public static final String loginBtn = "btnLogin";
	}
	
	
	public static class AssignLeavemodule{
		
		
		public static final String  assignleavebtn = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/span";
		
		public static final String employeename="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]";
		public static final String leavetype="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select";
		
		public static final String  fromdate="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/input";
		public static final String   todate="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input";
		public static final String   comment="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[10]/textarea";
		
		
		public static final String assignbtn = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input";
		
		
		
		
		
	}

}
