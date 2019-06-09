package lab2;

import java.util.ArrayList;

public class BidObject implements Subject {
	
	public String slotAuthor;
	public double slotPrice;
	public String slotName;
	
	
	private ArrayList <Observer> bidders;

	
	public BidObject() {
		bidders = new ArrayList<Observer>();
	}
	
	
	@Override
	public void addObserver(Observer o) {
		bidders.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		bidders.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < bidders.size(); i++) {
			   Observer bid = bidders.get(i);
			   bid.update(slotAuthor, slotPrice, slotName);
			  }
		
	}
	
	public void slotChanged() {
		notifyObservers();
	}
	
	
	public void setChanges(String slotAuthor, double slotPrice, String slotName) {
		this.slotAuthor = slotAuthor;
		this.slotName = slotName;
		this.slotPrice = slotPrice;
		slotChanged();
	}

}
