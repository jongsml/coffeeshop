package nl.hanze.coffeeshop;


import java.util.Comparator;

public class Item2Comparator implements Comparator<Object>
{

	 public int compare(Object o1, Object o2){
		 if (((Item)o1).getPrice() < ((Item)o2).getPrice()) return -1;
		        if (((Item)o1).getPrice() > ((Item)o2).getPrice()) return 1;
		        return 0;
		    } 
	 
	 public int doIets()
	 {
		 
		 return (Integer) null;
	 }

}