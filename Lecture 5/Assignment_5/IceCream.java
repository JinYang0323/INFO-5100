
public class IceCream extends DessertItem{
	int cost;
	public IceCream() {};
	public IceCream(String name, int cost) {
		this.name = name;
		this.cost = cost;
	};
	public int getCost() {
		return cost;
	}
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		DessertShoppe dessertShoppe = new DessertShoppe();
		sBuilder.append(name);
		for(int i = 0; i < DessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - name.length() - dessertShoppe.cents2dollarsAndCentsmethod(getCost()).length(); i++) 
			sBuilder.append(" ");
		sBuilder.append(dessertShoppe.cents2dollarsAndCentsmethod(getCost()) + "\n");
		return sBuilder.toString();
	}
}
