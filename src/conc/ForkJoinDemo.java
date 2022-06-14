package conc;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {

	public static void main(String[] args) {
		int ans = ForkJoinSum.generateProcess(1000);// 1 to 1000
		System.out.println(ans);
	}
}

//RecursiveTask class -> java 
//extends Thread ,
//Runnable
//Callable 
class ForkJoinSum extends RecursiveTask<Integer> {
	int sum = 0;
	int start;
	int end;
	int maxCount = 300;// 1 time 100 elements addition
	// 1 to 1000 => 10
	// 1 to 500 =>

	// start and end set
	public ForkJoinSum(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		if(this.end == 1000) {
			return addition();
		}
		ForkJoinSum task1 = new ForkJoinSum(1, 500);// 1 300
		task1.fork();//execute logic with independent thread  //1 to 500

		ForkJoinSum task2 = new ForkJoinSum(501, 1000);// 301 600

		int sumTask2 = task2.compute();//sum
		int sumTask1 = task1.join();//sum

		return sumTask1 + sumTask2;

	}

	public int addition() {
		for (int i = this.start; i <= this.end; i++) {
			sum = sum + i;
		}
		return sum;
	}

	static Integer generateProcess(int total) {
		ForkJoinTask<Integer> task = new ForkJoinSum(1, total);
		return new ForkJoinPool().invoke(task);
	}

}