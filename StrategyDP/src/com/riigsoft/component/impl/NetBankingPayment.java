package com.riigsoft.component.impl;

import com.riigsoft.component.IPayment;

public  final class NetBankingPayment  implements IPayment {
	
	public   String doPay(String  account, float amount) {
		return  "This amount :"+ amount+" Paid thru BETBANK with ACC: "+account;
	}

}
