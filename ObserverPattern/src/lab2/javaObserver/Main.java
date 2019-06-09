package lab2.javaObserver;


public class Main {

	public static void main(String[] args) {
		BidObject bid = new BidObject();
		
		
		Bidder_Rashad bR = new Bidder_Rashad(bid);
		
		bid.setChanges("Rashad", 9, "Qala");
		bid.setChanges("Mila", 9, "Qala");
		
		bR.update(bid, null);

	}

}
