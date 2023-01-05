package com.nexttechmeta.PageAction;

import org.testng.Assert;

import com.nexttechmeta.PageLocator.AccountPageLocator;

import Utility.Base_Parent;

public class AccountPageAction extends Base_Parent {

	AccountPageLocator accountpagelocator= new AccountPageLocator();
	
	public void Verifyusercanloginwithvalidatecard() throws Exception {
	
	Thread.sleep(5000);	
	boolean verifyAccountProfile=	accountpagelocator.AccountProfile.isDisplayed();
	Assert.assertTrue(verifyAccountProfile);
		
	}
	
}
