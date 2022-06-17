package collectiond;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int a[] = new int[5];// int : 5

		ArrayList list = new ArrayList();// any : any size

		ArrayList<Integer> intList = new ArrayList<Integer>();// int : any size
		intList.add(20);// 0
		intList.add(30);// 1
		intList.add(20);// 2 allow duplicate
		intList.add(130);// 3
		intList.add(3);// 4

		System.out.println(intList);// X array [ loop]
		// ordered

		// array - index a[i] a[0]
		// ArrayList index

		int k = intList.get(0);
		System.out.println(k);

		System.out.println(intList.get(2));

		System.out.println(intList.size());

		// remove -->
		intList.remove(0);// 0th index
		System.out.println(intList);

		intList.remove((Integer) 30);// 30 data
		System.out.println(intList);

		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		for (int y : intList) {
			System.out.println(y);
		}
		
		System.out.println(intList.contains(300));
		System.out.println(intList.contains(130));
		
		
		
		
		
		
		
		
		
		
		
	}

}
