package streamdemo;

import java.util.Arrays;
import java.util.List;

public class Stream2 {

	public static void main(String[] args) {

		// collection - 1,2,3,4,5
		// process -> condition

		anyMatchEven();
	}

	static void anyMatchEven() {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		// it will check for a single element which must be even then
		// return true else false
		List<Integer> list = Arrays.asList(1,3,5);
		boolean ans = list.stream().anyMatch(v -> v % 2 == 0);
		System.out.println(ans);

	}

	static void allMatchEven() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//		List<Integer> list = Arrays.asList(2,4,6);

		boolean ans = list.stream().allMatch(v -> v % 2 == 0);// it will check
		// for all the elements , if all are even then returns true
		// if any of the elements is odd it reutrns false
		System.out.println(ans);

	}
}
