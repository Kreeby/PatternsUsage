package lab4;

public class NYStyleIceCream extends IceCreamStore{

	
	
	
	@Override
	IceCream createIceCream(String type) {
		if(type.equals("Rocky Road")) {
			return new NYStyleRockyRoad();
		}
		if(type.equals("Peanut Cream")) {
			return new NYStylePeanutCream();
		}
		if(type.equals("Cookie Dough")) {
			return new NYStyleCookieDough();
		}
		if(type.equals("Cherry Blossom")) {
			return new NYStyleCherryBlossom();
		}
 		return null;
	}

}
