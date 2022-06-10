package conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSumCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ThreadSum t = new ThreadSum();
		Future<Integer> sum = ex.submit(t);
		System.out.println("sum => "+sum.get());
		ex.shutdown();
	}
}

class ThreadSum implements Callable<Integer> {
	int sum = 0;

	public Integer call() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
