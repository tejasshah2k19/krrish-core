package threadd;

public class BankDemo {

	public static void main(String[] args) {
		Account acct = new Account();
		Thread a1 = new Thread(acct);
		a1.setName("radha");
		Thread a2 = new Thread(acct, "shyam");
		Thread a3 = new Thread(acct, "ravan");

		a1.start();
		a2.start();
		a3.start();

		// old
//		acct.start();// stack --> finish
//		try {
//			acct.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} //
//		acct.printBalance();
	}
}

class Account extends Thread {
	int bal = 10000;

//	public synchronized void wid(int amt) {
//		//
//		//
//		// 5 second 
//		//
//		if (bal >= 0 && bal - amt >= 0) {
//			this.bal = this.bal - amt;// 10000-2000 => 8000
//			System.out.println(currentThread().getName() + " wid done and balance  = > " + bal);
//		} else {
//			System.out.println(currentThread().getName() + " wid not done");
//		}//2 second 
//		//
//		//
//		// 3 second 
//		//
//	}
	//10 second 
	
	public  void wid(int amt) {
		//
		//
		// 5 second 
		//
		synchronized(this) {
			if (bal >= 0 && bal - amt >= 0) {
				this.bal = this.bal - amt;// 10000-2000 => 8000
				System.out.println(currentThread().getName() + " wid done and balance  = > " + bal);
			} else {
				System.out.println(currentThread().getName() + " wid not done");
			}
		}//2 second 
		//
		//
		// 3 second 
		//
	}
	public void run() {
		wid(5000);
	}

	public void printBalance() {
		System.out.println("balance => " + bal);// 8000
	}

}