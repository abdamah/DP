package com.riigsoft.test;


import com.nt.factory.ECommerceStoreFactory;
import com.riigsoft.store.ECommerceStore;

public class StrategyDPTest {

	public static void main(String[] args) {
		ECommerceStore store=null;
		String msg=null;
		//get Ecommerce Store
		store=ECommerceStoreFactory.getInstance("ZAAD");
		//invoke method
		msg=store.shopping(new String[] {"shirt","jeans","shoe"},new float[] {3000,5000,2000}, "45673");
		System.out.println(msg);		
		System.out.println("............................................................");
		
		//get Ecommerce Store
				store=ECommerceStoreFactory.getInstance("EVCPLUS");
				//invoke method
				msg=store.shopping(new String[] {"shirt","jeans","shoe"},new float[] {3000,5000,2000}, "45673");
				System.out.println(msg);		

	}

}
