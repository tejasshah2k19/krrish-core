package streamdemo;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamWithFunctionLinking {

	public static void main(String[] args) {

//		DoubleStream.of(1.0, 4.0, 9.0).map(Math::sqrt).peek(System.out::println).sum();
		System.out.println("*********************");
//		DoubleStream.of(1, 2, 3, 4, 5).map(i -> i * i).peek(i -> System.out.println(i)).sum();
//		DoubleStream.of(1, 2, 3, 4, 5).map(i -> i * i).forEach(i->System.out.println(i));
//		DoubleStream.of(1, 2, 3, 4, 5).map(i -> i * i).forEach(System.out::println);
//		DoubleStream.of(1, 2, 3, 4, 5).map(MyFunction::square).forEach(System.out::println);
//		MyFunction.square(12); //calling 
		double ans = DoubleStream.of(1, 2, 3, 4, 5).map(MyFunction::square).peek(System.out::println).sum();
		System.out.println("sum => " + ans);

		//string-> royal edu madam sir raja 
		//length > 3 => filter 
		
		Stream.of("royal","edu","madam","sir","raja").filter(str->str.length()>3).forEach(System.out::println);
		
	}
}

class MyFunction {
	public static double square(double x) {
		return x * x;
	}
}