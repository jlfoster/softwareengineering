package org.jlfoster.cosc310.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
	private ArrayList<MenuItem> items;
	
	public Menu(ArrayList<MenuItem> items)
	{
		this.items = items;
	}
	
	public ArrayList<MenuItem> getUserChoices(Scanner scanner)
	{
		for (int i = 1; i <= items.size(); i++)
		{
			MenuItem item = items.get(i - 1);
			System.out.print(i + ". ");
			System.out.print(item.getName() + " ");
			System.out.println("(" + item.getPrice() + ")");
		}
		
		System.out.println("Enter a list of your choices separated by spaces");
		System.out.println("Or 0 to exit");
		System.out.print(" > ");
		
		String input = scanner.nextLine();
		
		if (input.equals("0"))
			return null;
		
		String[] selections = input.split(" ");
		
		ArrayList<MenuItem> menuChoices = new ArrayList<MenuItem>();
		try
		{
			for (String selection : selections)
			{
				int number = Integer.parseInt(selection);
				MenuItem item = items.get(number - 1);
				MenuItem choice = new MenuItem(item.getName(), item.getPrice());
				menuChoices.add(choice);
			}
		}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid choices");
			System.exit(1);
		}
		
		return menuChoices;
	}
}
