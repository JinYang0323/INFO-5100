
public class Cookie extends DessertItem{
	int number;
	int pricePerDozen;
	public Cookie() {};
	public Cookie(String name, int number, int pricePerDozen) {
		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	};
	public int getCost() {
		return number * pricePerDozen / 12;
	}
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		DessertShoppe dessertShoppe = new DessertShoppe();
		sBuilder.append(number + " @ " + pricePerDozen + " /dz.\n");
		sBuilder.append(name);
		for(int i = 0; i < DessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - name.length() - dessertShoppe.cents2dollarsAndCentsmethod(getCost()).length(); i++) 
			sBuilder.append(" ");
		sBuilder.append(dessertShoppe.cents2dollarsAndCentsmethod(getCost()) + "\n");
		return sBuilder.toString();
	}
}
