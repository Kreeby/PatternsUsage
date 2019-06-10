package lab3;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new BagelPizza();
		
		pizza = new RedOnion(pizza);
		pizza = new RomaTomatoes(pizza);
		
		System.out.println(pizza.getDescription() + ", $" + pizza.cost());
		

	}

}
