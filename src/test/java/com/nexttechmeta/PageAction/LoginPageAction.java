package com.nexttechmeta.PageAction;

import com.nexttechmeta.PageLocator.LoginPageLocator;

import Utility.Base_Parent;

public class LoginPageAction extends Base_Parent {

	LoginPageLocator loginpagelocator= new LoginPageLocator();
	
	
	
	public void metaLoginCard(String u, String p) throws Exception {
		Thread.sleep(7000);
	loginpagelocator.UserName.sendKeys(u);
	loginpagelocator.Password.sendKeys(p);
	loginpagelocator.LoginButton.click();
		
	}
	
}
