
public class Candy extends DessertItem{
	double weight;
	int pricePerPound;
	public Candy(String name, double weight, int pricePerPound) {
		this.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	};
	public int getCost() {
		return (int)(weight * pricePerPound);
	}
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		DessertShoppe dessertShoppe = new DessertShoppe();
		sBuilder.append(weight + " lbs. @ " + pricePerPound + " /lb.\n");
		sBuilder.append(name);
		for(int i = 0; i < DessertShoppe.WIDTH_OF_COSTS_ON_RECEIPT - name.length() - dessertShoppe.cents2dollarsAndCentsmethod(getCost()).length(); i++) 
			sBuilder.append(" ");
		sBuilder.append(dessertShoppe.cents2dollarsAndCentsmethod(getCost()) + "\n");
		return sBuilder.toString();
	}
}
