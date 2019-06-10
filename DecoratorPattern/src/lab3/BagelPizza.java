package lab3;

public class BagelPizza extends Pizza{

	public BagelPizza() {
		description = "Bagel Pizza";
	}
 	
	@Override
	public double cost() {
		return 1.99;
	}

}
