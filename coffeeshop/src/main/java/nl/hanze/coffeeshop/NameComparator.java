package nl.hanze.coffeeshop;

import java.util.Comparator;

public class NameComparator implements Comparator<Item>
{
	@Override
	public int compare(Item o1, Item o2) 
	{
		String name1 = o1.getName();        
	    String name2 = o2.getName();
	    return name1.compareTo(name2);
	}
}
