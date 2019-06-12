package lab4;

public abstract class IceCreamStore {
	
	
	public IceCream orderIceCream(String type) {
		IceCream iceCream;
		
		iceCream = createIceCream(type);
		iceCream.prepare();
		iceCream.pour();
		iceCream.blend();
		iceCream.addChunkyChocolate();
		iceCream.freeze();
		iceCream.decorate();
		iceCream.putInCup();
		
		return iceCream;
	}
	
	abstract IceCream createIceCream(String type);

}
