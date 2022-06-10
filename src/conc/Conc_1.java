package conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Conc_1 {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(5);// 1 2 3 4 5
		for (int i = 1; i <= 5; i++) {
			SumN s = new SumN();
			s.n = 10 + i;
//			s.start();//traditional [same time 1 thread] 
//			ex.submit(s);//[queue->1 2 3 4 5 ] all thread
			ex.execute(s);
		}
		ex.shutdown();
		//con -
	}
}

class SumN extends Thread {

	int sum = 0;
	int n;

	//n=1000000000000000000 -- task more than 30minutes + 
	public void run() {
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("1 to " + n + " => " + sum);

	}
}
