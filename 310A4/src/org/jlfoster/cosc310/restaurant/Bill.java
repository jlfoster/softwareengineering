package org.jlfoster.cosc310.restaurant;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bill {
	double subtotal = 0;
	ArrayList<MenuItem> choices;

	public Bill(ArrayList<MenuItem> choices)
	{
		this.choices = choices;
	}

	private void generateSubtotal()
	{
		subtotal = 0;
		
		for (MenuItem item : choices)
			subtotal += item.getPrice();
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
	
	/**
	 * Prompts the user for payment. If the bill is
	 * overpaid, the amount it is overpaid by is 
	 * returned as a tip.
	 * @return
	 */
	public double getUserPayment(Scanner scanner)
	{
		generateSubtotal();
		double owing = subtotal;
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
