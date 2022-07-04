package collectiond;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(1, "three");//add duplicate key then it overrides the value 
		hm.put(22, "ram");
		hm.put(25, "ram");
		hm.put(32, "ram");
		hm.put(52, "ram");
		
		
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		//sunday 26-6-2022 -> panjrapol --> cow --> 
		//7.15 omkareshware temple --> 
		
		System.out.println(hm.remove(2));
		System.out.println(hm);
	}
}
