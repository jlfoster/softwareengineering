package org.jlfoster.cosc310.restaraunt;

import java.util.ArrayList;
import java.util.Scanner;

public class Resturant {

	/**
	 * @param args
	 */
	/*
	*COSC 310 Assignment 4
	* Question 4
	* Jodie Foster 64323082
	* Carson Myers 21651120
	*/
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Menu menu = new Menu(MenuItem.getItems());
		Bill bill = new Bill(menu.getUserChoices(scanner));
		
		System.out.print("View bill? (y/n): ");
		if (scanner.nextLine().equals("y"))
		{
			
		}
	}

}
