package Core;
class MyThread1 implements Runnable{
	public void run() {
		int i = 0;
		while(i<5) {
			System.out.println("Thread1");
			System.out.println("This is my thread1 for runnable interface");
			i++;
		}
	}
}
class MyThread2 implements Runnable{
	public void run() {
		int i = 0;
		while(i<5) {
			System.out.println("Thread2");
			System.out.println("This is my thread2 for runnable interface");
			i++;
		}
	}
}
public class runnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		Thread n1 = new Thread(t1);
		Thread n2 = new Thread(t2);
		n1.start();
		n2.start();
		
	}

}
