package lab4;

import java.util.ArrayList;

public abstract class IceCream {
	
	String name;
	
	
	ArrayList<String> toppings = new ArrayList<String>();
	
	
	void prepare() {
		System.out.println("Preparing: " + name);
	}
	
	void pour() {
		System.out.println("Pouring the milk, heavy cream, vanilla and sugar...");
	}
	
	
	void blend() {
		System.out.println("Blending until smooth...");
	}
	
	void addChunkyChocolate() {
		System.out.println("Adding chunky chocolate...");
	}
	
	void freeze() {
		System.out.println("Freezing...");
	}
	
	void decorate() {
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("Adding some toppings: " + toppings.get(i) +", ");
		}
	}
	
	void putInCup() {
		System.out.println("Putting in the nice cup...");
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	

}
