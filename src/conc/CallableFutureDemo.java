package conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(final String[] arguments) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newSingleThreadExecutor();//1 at a time 

		System.out.println("Factorial Service called for 10!");
		Future<Long> result10 = executor.submit(new FactorialService(10));

		System.out.println("Factorial Service called for 20!");
		Future<Long> result20 = executor.submit(new FactorialService(20));

		Long factorial10 = result10.get();
		System.out.println("10! = " + factorial10);

		Long factorial20 = result20.get();
		System.out.println("20! = " + factorial20);

		executor.shutdown();
	}

}
//Future -> let execute my task for a long duration , once task done i will use result [no wait] 
class FactorialService implements Callable<Long> { //extends Thread implments Runnable -> run()
	
	//Callable=>  call() 
	
	private int number;

	public FactorialService(int number) {
		this.number = number;
	}

	@Override
	public Long call() throws Exception {
		return factorial();
	}

	private Long factorial() throws InterruptedException {
		long result = 1;

		while (number != 0) {
			result = number * result;
			number--;
			Thread.sleep(100);//ms wait 
		}
		return result;
	}
}