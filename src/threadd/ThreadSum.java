package threadd;

public class ThreadSum {

	public static void main(String[] args) throws InterruptedException {
		FindSum fs = new FindSum();
		fs.start();
		synchronized (fs) {
			fs.wait();
		}

		System.out.println(fs.sum);
	}
}

class FindSum extends Thread {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		synchronized (this) {
			notify();
		}
	}

}