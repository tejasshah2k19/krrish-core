package conc;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ThreadArraySum ts = new ThreadArraySum();
		ThreadArrayListSum tsa = new ThreadArrayListSum();

		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<Integer> ans1 = ex.submit(ts);
		Future<Integer> ans2 = ex.submit(tsa);

		System.out.println(ans1.get() + ans2.get());
	}
}

class ThreadArraySum implements Callable<Integer> {

	int a[] = new int[5];
	int sum = 0;

	public ThreadArraySum() {
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;// 1 2 3 4 5
		}
	}

	public Integer call() throws Exception {
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}

class ThreadArrayListSum implements Callable<Integer> {
	int sum = 0;
	ArrayList<Integer> list = new ArrayList<Integer>();

	public ThreadArrayListSum() {
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
	}

	public Integer call() throws Exception {
		for (int x : list) {
			sum = sum + x;
		}

		return sum;
	}
}