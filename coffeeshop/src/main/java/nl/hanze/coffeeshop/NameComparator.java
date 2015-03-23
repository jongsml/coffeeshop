package nl.hanze.coffeeshop;

import java.util.Comparator;

public class NameComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		String name1 = ((Item)o1).getName();        
	    String name2 = ((Item)o2).getName();
	    return name1.compareTo(name2);
	}
}
