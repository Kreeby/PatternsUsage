package lab3;

public class RedOnion extends PizzaDecorator {
	
	Pizza pizza;
	
	public RedOnion(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with Red Onions";
	}

	@Override
	public double cost() {
		return .20 + pizza.cost();
	}

}
