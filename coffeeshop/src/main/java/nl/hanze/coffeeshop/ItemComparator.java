package nl.hanze.coffeeshop;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item>
{
	 public int doIets()
	 {
		 
		 return (Integer) null;
	 }
	 
	@Override 
	public int compare(Item o1, Item o2) 
	{
		if (((Item)o1).getPrice() < ((Item)o2).getPrice()) return -1;
	    if (((Item)o1).getPrice() > ((Item)o2).getPrice()) return 1;
	    	return 0;
		
	}

}
