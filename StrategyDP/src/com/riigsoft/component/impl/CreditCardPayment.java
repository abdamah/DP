package com.riigsoft.component.impl;

import com.riigsoft.component.IPayment;

public  final class CreditCardPayment  implements IPayment {
	
	public   String doPay(String  account, float amount) {
		return "This amount :"+amount+" Paid thru CREDITCARD with ACC: "+account;
	}

}
