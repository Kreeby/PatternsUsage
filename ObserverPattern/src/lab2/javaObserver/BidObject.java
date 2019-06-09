package lab2.javaObserver;

import java.util.ArrayList;
import java.util.Observable;


public class BidObject extends Observable {	
	
	public String slotAuthor;
	public double slotPrice;
	public String slotName;
	

	
	public BidObject() {
		
	}
	
	
	public void setChanges(String slotAuthor, double slotPrice, String slotName) {
		this.slotAuthor = slotAuthor;
		this.slotPrice = slotPrice;
		this.slotName = slotName;

		setChanged();
		notifyObservers();		
	}
	
	public String getAuthor() {
		return this.slotAuthor;
	}
	
	public double getPrice() {
		return this.slotPrice;
	}
	
	public String getName() {
		return this.slotName;
	}

}
