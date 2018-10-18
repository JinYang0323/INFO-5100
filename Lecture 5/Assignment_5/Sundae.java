
public class Sundae extends IceCream{
	int costOfIceCream;
	String nameOfTopping;
	int costOfTopping;
	public Sundae() {};
	public Sundae(String name, int costOfIceCream, String nameOfTopping, int costOfTopping) {
		this.name = name;
		this.costOfIceCream = costOfIceCream;
		this.nameOfTopping = nameOfTopping;
		this.costOfTopping = costOfTopping;
	};
	public int getCost() {
		return costOfIceCream + costOfTopping;
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
