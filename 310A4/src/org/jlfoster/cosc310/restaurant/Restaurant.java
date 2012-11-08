package org.jlfoster.cosc310.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

	/**
	 * COSC 310 Assignment 4
	 * Question 4
	 * Jodie Foster 64323082
	 * Carson Myers 21651120
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (mainLoop(scanner))
			;
		
		scanner.close();
	}
	
	private static boolean mainLoop(Scanner scanner)
	{
		Server server = Server.getRandomServer();
		System.out.println("Your server is " + server.getName());
		
		Menu menu = new Menu(MenuItem.getItems());	
		ArrayList<MenuItem> choices = menu.getUserChoices(scanner);
		if (choices == null)
			return false;
		
		Bill bill = new Bill(choices);
		
		System.out.print("View bill? (y/n): ");
		bill.printBill(scanner.nextLine().equals("y"));		
		double tip = bill.getUserPayment(scanner);
		server.addTips(tip);
		
		System.out.println(server.getName() + "'s tips:  " + server.getTips());
		
		return true;
	}
}
