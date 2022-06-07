package conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {

		Play p = new Play();
		ThreadFactory tf = Executors.defaultThreadFactory();
		ExecutorService ex = Executors.newCachedThreadPool();
		//2--7 [60second]
		ex.submit(p);
		ex.shutdown();
	}
}

class Play extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
