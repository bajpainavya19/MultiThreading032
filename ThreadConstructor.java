package Core;
class NewRunnable implements Runnable{
	private String taskName;
	public NewRunnable(String taskName) {
		this.taskName = taskName;
	}
	public void run() {
		System.out.println("Task name is: " + taskName);
	}
}
public class ThreadConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewRunnable nr = new NewRunnable("Thread");
		Thread t = new Thread(nr,"Thread");
		t.start();
		System.out.println("The ID of the string is: " + t.getId());
		System.out.println("The name of the string is: " + t.getName());

	}

}
