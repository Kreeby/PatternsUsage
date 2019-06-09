package lab2;

public class Bidder_John implements Observer{


	private double slotPrice;
	private String slotAuthor;
	private String slotName;
	private Subject auctionData;
	
	
	public Bidder_John(Subject auctionData) {
		this.auctionData = auctionData;
		auctionData.addObserver(this);
	}
	
	@Override
	public void update(String slotAuthor, double slotPrice, String slotName) {
		this.slotPrice = slotPrice;
		this.slotAuthor = slotAuthor;
		this.slotName = slotName;
	}
	
	
	public void display() {
		System.out.println("Current author: " + slotAuthor + ", current price: " + slotPrice + ", current slot name: "+ slotName);
	}

}
