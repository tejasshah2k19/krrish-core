package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("royal", "education", "yellow", "blue");
		// print all string who's length is > 4
		list1.stream().filter(x -> x.length() > 4).forEach(x -> System.out.println(x));

		// print all string in uppercase who's length is > 4
		list1.stream().filter(x -> x.length() > 4).forEach(x -> System.out.println(x.toUpperCase()));

		// print all string in uppercase who's length is > 4 and store into anoter list
		System.out.println("***********");
		List<String> strUpper4 = list1.stream().filter(x -> x.length() > 4)
				.peek(x -> System.out.println(x.toUpperCase()))
				.map(x->x.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(strUpper4);
		
		
		Stream<String>  strStream = Stream.of("blue","red","silver","white","black","purple");
		
	}
}
