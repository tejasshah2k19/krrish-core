package collectiond;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(10);
		hs.add(-10);
		hs.add(100);
		hs.add(-101);
		hs.add(1000);
		hs.add(500);
		hs.add(210);

		hs.add(1000);// false
		hs.add(100); // false
		System.out.println(hs);

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(-10);
		ts.add(100);
		ts.add(-101);
		ts.add(1000);
		ts.add(500);
		ts.add(210);

		ts.add(1000);// false
		ts.add(100); // false
		System.out.println(ts);
		ts.remove(100);// true | false
		System.out.println(ts);

		System.out.println(ts.subSet(10, 500));
		System.out.println(ts.subSet(10, true, 500, true));
		System.out.println(ts.contains(500));
		System.out.println(ts.contains(222));

		// ts.clear(); // this will remove all the elements from set

		System.out.println(ts.isEmpty());// true | false

		System.out.println(ts.headSet(210));// 210 <
		System.out.println(ts.tailSet(210));// >= 210
	}
}
