package threadd;

public class BuySell {
	public static void main(String[] args) {

		Buy b = new Buy();
		b.start();
		Sell s = new Sell();
		s.start();
	}
}

class Buy extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("buy");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Sell extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("sell");
			try {
				sleep(510);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
