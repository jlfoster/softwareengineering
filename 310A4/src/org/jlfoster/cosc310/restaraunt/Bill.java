package org.jlfoster.cosc310.restaraunt;

import java.util.ArrayList;

public class Bill {
	double subtotal = 0;


	public void getBill(ArrayList<MenuItem> AL){
		//print out the titles
		System.out.println("Menu Item				Price");
		//for each item that they've selected
		for(MenuItem item : AL){
			//print out the name and price
			System.out.println(item.getName() +"		" + item.getPrice());
			//update the subtotal
			subtotal = subtotal + item.getPrice();
		}
		//pring out the subtotal
		System.out.println("Subtotal: " + subtotal);
	}
}
