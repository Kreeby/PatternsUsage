package lab3;

public class WhiteGoatCheese extends PizzaDecorator {

	
	Pizza pizza;
	
	public WhiteGoatCheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with White Goat Cheese";
	}

	@Override
	public double cost() {
		return .10 + pizza.cost();
	}
	
}
