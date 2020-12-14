package com.riigsoft.factory;

import com.riigsoft.component.BankService;
import com.riigsoft.component.BankServiceImpl;
import com.riigsoft.proxy.BankServiceProxy;

public class BankFactory {

	public static BankService getIntance(Boolean demonitization) {
		BankService service =null;
		if(demonitization)
			service = new BankServiceProxy();
		else
			service = new BankServiceImpl();
		return service;
	}
}
