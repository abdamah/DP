package com.riigsoft.factory;

import com.riigsoft.component.IPayment;
import com.riigsoft.component.impl.CreditCardPayment;
import com.riigsoft.component.impl.DebitCardPayment;
import com.riigsoft.component.impl.EVCPlus;
import com.riigsoft.component.impl.NetBankingPayment;
import com.riigsoft.component.impl.ZaadPayment;
import com.riigsoft.store.ECommerceStore;

public final class ECommerceStoreFactory {
	
	public  static  ECommerceStore   getInstance(String paymentType) {
		IPayment payment=null;
		ECommerceStore store=null;
	    store=new ECommerceStore();
	    if(paymentType.equalsIgnoreCase("ZAAD"))
	    	payment=new ZaadPayment();
	    else if(paymentType.equalsIgnoreCase("DEBIT"))
	    	payment=new DebitCardPayment();
	    else if(paymentType.equalsIgnoreCase("EVCPLUS"))
	    	payment=new EVCPlus();
	    else if(paymentType.equalsIgnoreCase("CREDIT"))
	    	payment=new CreditCardPayment();
	    else if(paymentType.equalsIgnoreCase("NETBANK"))
	    	payment= new NetBankingPayment();
	    else
	    	throw new IllegalArgumentException("INVALID PAYMENT TYPE");
	    //set dependent to target
	    store.setPayment(payment);
	    return store;
	    	
	}

}
