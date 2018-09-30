
public abstract class MoodyObject {
	public MoodyObject() {}
	
	protected abstract String getMood();
	protected abstract void expressFeelings();
	public void queryMood() {
		System.out.println("I feel " + getMood() + " today!\n");
	}
}
