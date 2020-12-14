package com.riigsoft.component;

public interface BankService {

	public String withDraw(int acno, long amt);
	public String deposit(int acno, long amt);
}
