package conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Conc1 {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(10);
		for(int i=1;i<=10;i++) {
			MyRunnable r = new MyRunnable(10+i);
			ex.submit(r);
		}
		ex.shutdown();
		System.out.println("all task done");
	}
}

class MyRunnable implements Runnable {
	private final long countUntil;

	MyRunnable(long countUntil) {
		this.countUntil = countUntil;
	}

	@Override
	public void run() {
		long sum = 0;
		System.out.println("start "+countUntil);
		for (long i = 1; i < countUntil; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
