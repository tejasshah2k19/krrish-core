package conc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcFirstDemo {

	public static void main(String[] args) {

		Copy c = new Copy();
		Delete d = new Delete();

		// traditional
//		c.start();
//		d.start();

//		Executor - I 
//		Executors - C

		ExecutorService ex = Executors.newFixedThreadPool(5);// os -> 5 worker

		ex.submit(c);// w1
		ex.submit(d);// w2
		// 3 4 5 -- free

		ex.shutdown();//release 

	}
}

class Copy extends Thread {
	public void run() {
	}
}

class Delete extends Thread {
	public void run() {
	}
}
