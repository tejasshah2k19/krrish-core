package conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
public class ScheduleThreadPoolDemo {

	public static void main(String[] args) {
		System.out.println("******************");
		Job j1 = new Job();
		Job j2 = new Job();

		ScheduledExecutorService s = Executors.newScheduledThreadPool(2);
//		s.schedule(j1, 10, TimeUnit.SECONDS);
//		s.schedule(j2, 15, TimeUnit.SECONDS);
		s.scheduleAtFixedRate(j1, 2, 2, TimeUnit.SECONDS);
//		s.shutdown();
	}
}

class Job extends Thread {
	public void run() {
		System.out.println("running....job");
	}
}
