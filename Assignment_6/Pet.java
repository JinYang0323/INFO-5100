import java.util.Date;

public class Pet {
	//data members
	private String petName, ownerName, color;
	protected int sex;
	
	enum Sex{
		MALE, FEMALE, SPRAYED, NEUTERED
	}
	
	public static void main(String[] args) {
		Pet pet = new Pet("Spot", "Mary", "Black and White");
		pet.setSex(0);
		System.out.println(pet);
		System.out.println();
		
		Cat cat = new Cat("Tom", "Bob", "Black", "short");
		cat.setSex(2);
		System.out.println(cat);
		cat.setBoardStart(3, 23, 1996);
		cat.setBoardEnd(10, 23, 2018);
		System.out.println("Is date between the start and end dates: " + cat.boarding(10, 5, 2018));
		System.out.println();
		
		Dog dog = new Dog("Dog", "Susan", "white", "medium");
		dog.setSex(1);
		System.out.println(dog);
		dog.setBoardStart(3, 23, 1996);
		dog.setBoardEnd(10, 23, 2018);
		System.out.println("Is date between the start and end dates: " + dog.boarding(10, 25, 2018));
	}
	public Pet(String petName, String ownerName, String color){
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	}
	public String getPetName() {
		return petName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getColor() {
		return color;
	}
	public void setSex(int sexid) {
		sex = sexid;
	}
	public String getSex() {
		Sex[] sx = Sex.values();
		return sx[sex].toString();
	}
	public String toString() {
		return getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex();
	}
}

interface Boardable{
	void setBoardStart(int month, int day, int year); 
	void setBoardEnd(int month, int day, int year); 
	boolean boarding(int month, int day, int year); 
}
