package com.nexttechmeta.PageAction;

import org.testng.Assert;

import com.nexttechmeta.PageLocator.CartPageLocator;

import Utility.Base_Parent;

public class CartPageAction extends Base_Parent {

	CartPageLocator cartpagelocator= new CartPageLocator();
	
	public void VerifyItemAddedInCart() throws Exception {
	
	Thread.sleep(4000);	
	boolean Verifycart=	cartpagelocator.VerifyCart.isDisplayed();
	Assert.assertTrue(Verifycart);
		
	}
	
}
