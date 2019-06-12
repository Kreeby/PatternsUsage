package lab4;

public class Main {

	public static void main(String[] args) {
		IceCreamStore nyStore = new NYStyleIceCream();
		
		IceCream iceCream = nyStore.orderIceCream("Cookie Dough");
		System.out.println("Rashad has ordered: " + iceCream.getName() + "\n");

	}

}
