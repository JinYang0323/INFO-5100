import java.util.Vector;

public class CheckOut{
	Vector<DessertItem> vector;	
	public CheckOut(){
		vector = new Vector<DessertItem>();	
	};
	public int numberOfItems() {
		return vector.size();
	}
	public void enterItem(DessertItem item) {
		vector.add(item);
	}
	public void clear() {
		vector.clear();
	}
	public int totalCost() {
		if(vector.isEmpty()) return 0;
		int result = 0;
		for(DessertItem item: vector) {
			result += item.getCost();
		}
		return result;
	}
	public int totalTax() {
		DessertShoppe dessertShoppe = new DessertShoppe();
		return (int)(totalCost() * dessertShoppe.TAX_RATE);
	}
	public String toString() {
		DessertShoppe dessertShoppe = new DessertShoppe();
		StringBuilder sBuilder = new StringBuilder(); 
		for(int i = 0; i < (dessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - dessertShoppe.MAX_SIZE_OF_ITEM_NAME); i++) {
			sBuilder.append(" ");
			if(i == (dessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - dessertShoppe.MAX_SIZE_OF_ITEM_NAME) / 2) 
				sBuilder.append(DessertShoppe.NAME_OF_STORE);
		}
		sBuilder.append("\n");
		for(int i = 0; i < (dessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - dessertShoppe.MAX_SIZE_OF_ITEM_NAME) / 2; i++) 
			sBuilder.append(" ");			
		for(int i = 0; i < dessertShoppe.MAX_SIZE_OF_ITEM_NAME; i++) sBuilder.append("-");
		sBuilder.append("\n");
		
		for(DessertItem dessertItem : vector) {
			sBuilder.append(dessertItem);			
		}
		
		sBuilder.append("\nTax:");
		for(int i = 0; i < dessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - 4 - dessertShoppe.cents2dollarsAndCentsmethod(totalTax()).length(); i++) 
			sBuilder.append(" ");
		sBuilder.append(dessertShoppe.cents2dollarsAndCentsmethod(totalTax()));
		sBuilder.append("\nTotal Cost:");
		for(int i = 0; i < dessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - 11 - dessertShoppe.cents2dollarsAndCentsmethod(totalCost()).length(); i++) 
			sBuilder.append(" ");
		sBuilder.append(dessertShoppe.cents2dollarsAndCentsmethod(totalCost()));
		return sBuilder.toString();
	}
}
