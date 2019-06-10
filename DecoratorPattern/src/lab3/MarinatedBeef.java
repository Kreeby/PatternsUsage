package lab3;

public class MarinatedBeef extends PizzaDecorator {

	Pizza pizza;
	
	public MarinatedBeef(Pizza pizza) {
		this.pizza = pizza;
	}
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with Marinated Beef";
	}

	@Override
	public double cost() {
		return .15 + pizza.cost();
	}

}
