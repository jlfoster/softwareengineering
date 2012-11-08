package org.jlfoster.cosc310.restaraunt;

import java.util.ArrayList;

public class MenuItem
{
	private String name;
	private double price;
	
	public MenuItem(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public static ArrayList<MenuItem> getItems()
	{
		ArrayList<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItem("Baked Potatoes", 5.99));
		items.add(new MenuItem("Shepherd's Pie", 9.99));
		items.add(new MenuItem("Hawaiian Pizza", 12.59));
		items.add(new MenuItem("Spaghetti and Eyeballs", 17.42));
		items.add(new MenuItem("Calamari", 172.38));
		
		return items;
	}
}
