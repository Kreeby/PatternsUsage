package lab3;

public class RomaTomatoes extends PizzaDecorator {
	
	Pizza pizza;
	
	public RomaTomatoes(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with Roma Tomatoes";
	}

	@Override
	public double cost() {
		return .35 + pizza.cost();
	}
}
