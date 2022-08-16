
package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SquareOfListData {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 3, 4, 6, 7, 9, 10);

		List<Integer> sqr = num.stream().map(n -> n * n).collect(Collectors.toList());

		num.stream().map(n->n*n).forEach(ans->System.out.println(ans));
		
	}
}
