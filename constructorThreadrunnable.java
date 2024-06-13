package Core;
class New implements Runnable{
	private String Name;
	public New(String Name) {
		this.Name=Name;
	}
	public void run() {
		System.out.println("Using constructor for runnable interface:" + Name);
	}
}
public class constructorThreadrunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New c = new New("Navya");
		Thread t = new Thread(c,"Navya");
		t.start();
		System.out.println("The ID of the thread is: " + t.getId());
		System.out.println("The name of the thread is: " + t.getName());

	}

}
