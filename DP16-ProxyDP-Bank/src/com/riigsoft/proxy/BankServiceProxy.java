package com.riigsoft.proxy;

import com.riigsoft.component.BankService;
import com.riigsoft.component.BankServiceImpl;

public class BankServiceProxy implements BankService {

	private BankService real=null;
	public BankServiceProxy() {
	System.out.println("BankServiceProxy::0-param constructor");
	real=new BankServiceImpl();
	}
	@Override
	public String withDraw(int acno, long amt) {
		System.out.println("BankServiceProxy.withDraw()");
		String msg=null;
		if(amt<=4000)
		msg=real.withDraw(acno, amt);
		else 
			msg ="only 4000 is allowed to take during demonitization time";
			
		return msg;
	}

	@Override
	public String deposit(int acno, long amt) {
		System.out.println("BankServiceProxy.deposit()");
		String msg=null;
		if(amt<=10000)
		msg=real.deposit(acno, amt);
		else 
			msg ="only 10000 is allowed to deposit during demonitization time";
			
		return msg;
	}

}
