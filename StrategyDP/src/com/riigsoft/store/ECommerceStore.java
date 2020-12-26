package com.riigsoft.store;

import java.util.Random;

import com.riigsoft.component.IPayment;

public final class ECommerceStore {
  private  IPayment payment;


  public void setPayment(IPayment iPayment) {
	this.payment = iPayment;
  }

  
	
	public   String  shopping(String items[],float prices[],String account) {
		 float billAmount=0.0f;
		 String message=null;
		//calc bill Amout
		 for(float price:prices) {
			 billAmount=billAmount+price;
		 }
		 //do payment
			message = payment.doPay(account, billAmount);
		 return "Bill Number: "+ new  Random().nextInt(100000)+ ", Bill Amount: "+billAmount+"----->"+message;
		 
		
	}
	
}
