package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class SceLoginPage {

	private ElementUtil elUtil;
	By  userName = By.id("username");
	By passWord = By.id("password");
	By signIn = By.xpath("//a[@title='Sign On']");
	public SceLoginPage(WebDriver driver) {
		elUtil = new ElementUtil(driver);
	}

	public void doLogin(String us, String pwd, String envType) {
		if(envType.equalsIgnoreCase("cloud")) {
			elUtil.doSendKeys(userName, us, 10);
			elUtil.doSendKeys(passWord, pwd);
			elUtil.doActionClick(signIn);
		}else if(envType.equalsIgnoreCase("onpremise")) {

		}else {
			System.out.println("Please enter valid env type. envtype should be either cloud or onpremise");
		}
	}

}
