package Core;

class Navya extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("It is a Daemon Thread");
        } else {
            System.out.println("It is not a Daemon Thread");
        }
    }
}

public class daemonThread {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Navya n1 = new Navya();
        Navya n2 = new Navya();
        
        n1.setDaemon(true); // Correct method to set a thread as daemon
        n1.start();
        n2.start();
    }
}
