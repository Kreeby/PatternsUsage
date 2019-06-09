package lab2;

public class Auctioneer {

	public static void main(String[] args) {
		BidObject bid = new BidObject();
		
		
		Bidder_John bidJohn = new Bidder_John(bid);
		
		
		bid.setChanges("Rashad", 0.4, "Hey");
		bid.setChanges("Gilas", 0.4, "Hey");
		
		bidJohn.display();
	}

}
