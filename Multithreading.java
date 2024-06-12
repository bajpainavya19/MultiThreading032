package Core;
class Car extends Thread{
	public void run() {
		int i = 0;
		while(i<10) {   // this condition is used to see that thread is concurrent that it manages the multiple instructions i.e. while loop is only for ex
		System.out.println("Engine is starting");
		System.out.println("Firstly put the keys in this");
		i++;
	    }
    }
}

class Train extends Thread{
	public void run() {
		int i = 0;
		while(i<10) {
		System.out.println("Train is ready to start");
		System.out.println("All the passengers were on time");
		i++;
	    }
    }
}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Train t = new Train();
		c.start();
		t.start();

	}

}
