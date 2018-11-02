
public class Assignment7_3{
	//simple Unit Test
	public static void main(String args[]){
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , "+ p.fight(s) ); //should be true , false
        System.out.println(p.fight(r) + " , "+ r.fight(p) ); //should be false , false
        System.out.println(r.fight(s) + " , "+ s.fight(r) ); //should be true , false
    }
}
class Tool{
	private int strengh;
	private char type;

	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getStrengh() {
		return strengh;
	}
	public void setStrengh(int strengh) {
		this.strengh = strengh;
	}
}
class Rock extends Tool{

	public Rock(int strengh) {
		setStrengh(strengh);
		setType('r');
	}
	public boolean fight(Tool tool) {
		int currStrengh = getStrengh();
		if(tool.getType() == 'p') currStrengh /= 2;
		else if(tool.getType() == 's') currStrengh *= 2;
		return (currStrengh > tool.getStrengh());
	}
}
class Paper extends Tool{
	public Paper(int strengh) {
		setStrengh(strengh);
		setType('p');
	}
	public boolean fight(Tool tool) {
		int currStrengh = getStrengh();
		if(tool.getType() == 's') currStrengh /= 2;
		else if(tool.getType() == 'r') currStrengh *= 2;
		return (currStrengh > tool.getStrengh());
	}
}
class Scissors extends Tool{
	public Scissors(int strengh) {
		setStrengh(strengh);
		setType('s');
	}
	public boolean fight(Tool tool) {
		int currStrengh = getStrengh();
		if(tool.getType() == 'r') currStrengh /= 2;
		else if(tool.getType() == 'p') currStrengh *= 2;
		return (currStrengh > tool.getStrengh());
	}
}
class RockPaperScissorsGame{
    
}