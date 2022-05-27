package threadd;

public class Thread1 {

	public static void main(String[] args) {

		Copy c = new Copy();
		Movie m  = new Movie();
		Cut ct = new Cut();
		c.start();
		m.start();
		Thread t = new Thread(ct);
		t.start();

	}
}

//1 extends Thread 
//2 implements Runnable

//1 extends Thread
//override run()
class Copy extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("copy => " + i);
		}
	}
}

class Movie extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("movie => " + i);
		}
	}
}


class Cut implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("cut => " + i);
		}
		
	}
}


