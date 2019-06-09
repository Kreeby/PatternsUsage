package lab2.javaObserver;

import java.util.Observable;
import java.util.Observer;

public class Bidder_Rashad implements Observer {

	private Observable auctionData;
	private BidObject subject;
	public String slotAuthor;
	public double slotPrice;
	public String slotName;

	public Bidder_Rashad(Observable auctionData) {
		this.auctionData = auctionData;
		auctionData.addObserver(this);
	}

	@Override
	public void update(Observable subject, Object newState) {

		this.subject = (BidObject) subject;

		this.slotAuthor = this.subject.getAuthor();
		this.slotPrice = this.subject.getPrice();
		this.slotName = this.subject.getName();

		display();

	}

	public void display() {
		System.out.println(
				"Current author: " + slotAuthor + ", current price: " + slotPrice + ", current slot name: " + slotName);
	}
}
