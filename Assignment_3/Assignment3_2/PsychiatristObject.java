
public class PsychiatristObject {
	public PsychiatristObject() {}
	
	public void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today?");
		moodyObject.queryMood();
	}
	public void observe(MoodyObject moodyObject) {
		moodyObject.expressFeelings();
		System.out.println("Observation: " + moodyObject.toString() + "\n");
	}
}
