package collectiond;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(20);
		pq.add(-1);
		pq.add(15);
		pq.add(-20);
		pq.add(200);
		pq.add(150);
		pq.add(-20);
		
		System.out.println(pq);
		System.out.println(pq.size());

		System.out.println(pq.poll());// top-asc
		System.out.println(pq.poll());// top-asc

		// pq -> gives you first element is asc ,also it removes element from queue,
		System.out.println(pq);
		System.out.println(pq.size());
		// top --> but not remove
		System.out.println(pq.peek());// top - but not removing
		System.out.println(pq.contains(150));
	}
}
