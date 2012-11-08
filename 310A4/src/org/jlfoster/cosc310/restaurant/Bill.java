package org.jlfoster.cosc310.restaurant;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bill {
	double subtotal = 0;
	double taxes = 0;
	double TOTAL = 0;
	private final double TAX_HST = 0.12;
	ArrayList<MenuItem> choices;

	public Bill(ArrayList<MenuItem> choices)
	{
		this.choices = choices;
	}
	
	public void printBill(boolean showItems){
		//print out the titles
		if (showItems)
			System.out.println("Menu Item				Price");
		//for each item that they've selected
		for(MenuItem item : choices){
			//print out the name and price
			if (showItems)
				System.out.println(item.getName() +"		" + item.getPrice());
			//update the subtotal
			subtotal = subtotal + item.getPrice();
		}
		//calculate the tax and total
		taxes = subtotal * TAX_HST;
		TOTAL = taxes + subtotal;
		//prints out the subtotal, hst and then the total 
		System.out.println("Subtotal: " + subtotal);
		System.out.println("HST: 	  " + taxes);
		System.out.println("           __________");
		System.out.println("TOTAL:    " + TOTAL);
	}
	
	/**
	 * Prompts the user for payment. If the bill is
	 * overpaid, the amount it is overpaid by is 
	 * returned as a tip.
	 * @return
	 */
	public double getUserPayment(Scanner scanner)
	{
		double owing = TOTAL;
		while (owing > 0)
		{
			System.out.println("You owe " + owing);
			System.out.print("Enter amount to pay: ");
			try
			{
				owing -= scanner.nextDouble();
				scanner.nextLine();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Payment failed.");
			}
		}
		
		return -1 * owing;
	}
}
