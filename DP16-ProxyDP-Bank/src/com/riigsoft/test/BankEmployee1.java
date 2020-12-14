package com.riigsoft.test;

import com.riigsoft.component.BankService;
import com.riigsoft.constant.RBIConstants;
import com.riigsoft.factory.BankFactory;

public class BankEmployee1 {

	public static void main(String[] args) {
		BankService service1=null, service2=null;
		service1= BankFactory.getIntance(RBIConstants.DEMONITIZATION);
		System.out.println(service1.withDraw(1001, 7000));
		System.out.println(service1.deposit(1002, 20000));
		System.out.println("-----------------------------------------------");
		service1= BankFactory.getIntance(RBIConstants.DEMONITIZATION);
		System.out.println(service1.withDraw(1001, 3000));
		System.out.println(service1.deposit(1002, 8000));

	}

}
