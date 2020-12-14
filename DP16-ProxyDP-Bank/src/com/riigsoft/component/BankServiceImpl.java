package com.riigsoft.component;

public class BankServiceImpl implements BankService {

	public BankServiceImpl() {
		System.out.println("BankServiceImpl.::0-param constructor");
	}
	@Override
	public String withDraw(int acno, long amt) {
		System.out.println("BankServiceImpl.withDraw()");
		return "Drawing money from Bank Account No::"+acno +"  with amount ::"+amt;
	}

	@Override
	public String deposit(int acno, long amt) {
		System.out.println("BankServiceImpl.deposit()");
		return "Depositing money into Bank Account No::"+acno +"  with amount ::"+amt;
	}

}
