package com.nexttechmeta.PageAction;

import com.nexttechmeta.PageLocator.HomePageLocator;

import Utility.Base_Parent;

public class HomePageAction extends Base_Parent {

	HomePageLocator homepagelocator = new HomePageLocator();
	
	
	public void ClickLoginlink() throws Exception {
		
		homepagelocator.LoginLink.click();
		Thread.sleep(7000);
	}

	public void clickNokiaLumia() {
		
		homepagelocator.NokiaPhone.click();
		
	}
	
	public void ClickAddtoCart() throws Exception {
		
		homepagelocator.AddToCart.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
			
	}
	
	public void ClickCart() {
		
		homepagelocator.CartLink.click();
		
		
	}
	
	
	
}
