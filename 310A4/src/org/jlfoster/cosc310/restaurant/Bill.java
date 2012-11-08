package org.jlfoster.cosc310.restaurant;

import java.util.ArrayList;

public class Bill {
	double subtotal = 0;
	ArrayList<MenuItem> choices;

	public Bill(ArrayList<MenuItem> choices)
	{
		this.choices = choices;
	}

	public void printBill(){
		//print out the titles
		System.out.println("Menu Item				Price");
		//for each item that they've selected
		for(MenuItem item : choices){
			//print out the name and price
			System.out.println(item.getName() +"		" + item.getPrice());
			//update the subtotal
			subtotal = subtotal + item.getPrice();
		}
		//pring out the subtotal
		System.out.println("Subtotal: " + subtotal);
	}
	
	public void getUserPayment()
	{
		System.out.println("Paid bill.");
	}
}
