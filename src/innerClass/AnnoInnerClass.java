package innerClass;

public class AnnoInnerClass {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			public void run() {
				System.out.println("threading....");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();

		MyRunnable m = new MyRunnable();
		Thread t2 = new Thread(m);
		t2.start();
	}
}

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("threading....");
	}
}