package org.jlfoster.cosc310.restaurant;
import java.util.ArrayList;
import java.util.Random;

public class Server {

	private static Random randomGenerator = new Random();
	private static String[] serverNames = new String[] { "Joseph", "Brittany" };
	private static ArrayList<Server> servers;
	private String name;
	private double tips;
	
	static
	{
		servers = new ArrayList<Server>();
		for (int i = 0; i < serverNames.length; i++)
			servers.add(new Server(serverNames[i]));
	}
	
	public Server(String name)
	{
		this.name = name;
		tips = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getTips()
	{
		return tips;
	}
	
	public void addTips(double amount)
	{
		tips += amount;
	}

	public static Server getRandomServer(){
		int number = randomGenerator.nextInt(servers.size());
		return servers.get(number);
	}

}

