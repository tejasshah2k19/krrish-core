package lambda;

import java.util.ArrayList;

public class Lambda1 {

	public static void main(String[] args) {

		A a = new A();
		a.start();

		Runnable t = () -> {
			for(int i=1;i<=5;i++)
				System.out.println("hi");
		};
		// interface - single
		Thread tt = new Thread(t);
		tt.start();
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(190);
		list.add(290);

		for (Integer k : list) {
			System.out.println(k);
		}

		list.forEach((n) -> System.out.println(n));

		CalcFun add = (x, y) -> x + y;
		CalcFun sub = (x, y) -> x - y;
		
		System.out.println(add.perform(20,30));
		System.out.println(sub.perform(20, 5));
	}
}

class A extends Thread {
	public void run() {
		System.out.println("run from a ");
	}
}
@FunctionalInterface
interface CalcFun {
	int perform(int a, int b);
    
}
