package threadd;

public class Thread2 {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();

		a.start();
		b.start();
	}
}
class ThreadA extends Thread {
	public void run() {
		for (int i = 1; i < 12; i++) {
			System.out.println("i => " + i);
		}
	}
}
class ThreadB extends Thread {
	public void run() {
		try {
			sleep(1000);//wait 
		} catch (InterruptedException e) {
			e.printStackTrace();//default error --crash
		}// 1000ms- 1sec
		for (int j = 1; j < 12; j++) {
			System.out.println("j => " + j);
		}
	}
}
