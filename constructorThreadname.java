package Core;
class Name extends Thread{
	public Name(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Print the name of the thread");
	}
}
public class constructorThreadname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name("Navya");
		Name n2 = new Name("Isha");
		n1.start();
		n2.start();
		System.out.println("The id of our first thread n1 is: " + n1.getId());
		System.out.println("The name of our first thread is: " + n1.getName());
		System.out.println("The id of our second thread n1 is: " + n2.getId());
		System.out.println("The name of our second thread is: " + n2.getName());

	}

}
