package threadd;

public class ThreadMethods {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.setName("myThread");
		m.setPriority(1);// 1 to 10
		// 1 min
		// 5 mid
		// 10 max
		m.setPriority(Thread.MAX_PRIORITY);
		// by default every thread get MID priority.
		// main method it self a thread with MID priority.
		// all thread get unique id. to identify thread
		// you can not modify id of thread that is assign by JVM
		// 0 1 2 3
	} 
}

class MyThread extends Thread {
	public void run() {
		System.out.println(currentThread().getPriority());
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
	}
}
