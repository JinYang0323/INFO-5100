
public class test {
	public static void main(String args[]) {
		PsychiatristObject psychiatristObject = new PsychiatristObject();
		MoodyObject sad = new SadObject();
		MoodyObject happy = new HappyObject();
		psychiatristObject.examine(happy);
		psychiatristObject.observe(happy);
		psychiatristObject.examine(sad);
		psychiatristObject.observe(sad);
	}
}
