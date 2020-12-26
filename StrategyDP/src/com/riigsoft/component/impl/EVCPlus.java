package com.riigsoft.component.impl;

import com.riigsoft.component.IPayment;

public class EVCPlus implements IPayment {

	@Override
	public String doPay(String account, float amount) {
			return  "This amount :"+ amount+" Paid thru EVCPLUS with ACC: "+account;
		}


}
