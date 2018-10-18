import java.util.*;
public abstract class DessertItem{
	String name;
	public DessertItem() {};
	public DessertItem(String name) {
		this.name = name;
	};
	public final String getName() {
		return name;
	}
	public abstract int getCost();
}

class DessertShoppe{
	public static final double TAX_RATE = 0.065;	
	public static final String NAME_OF_STORE = "M & M Dessert Shoppe";
	public static final int MAX_SIZE_OF_ITEM_NAME = 20;
	public static final int WIDTH_OF_COSTS_ON_RECEIPT = 30;
	DessertShoppe(){};	
	public String cents2dollarsAndCentsmethod(int cents) {
		String s = String.valueOf(cents / 100.0);
		return s.charAt(0) == '0' ? s.substring(1) : s; 
	}
}


