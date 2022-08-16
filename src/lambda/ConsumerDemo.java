package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumerDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		// Consumer
		Consumer<Integer> ci = null;

		list.forEach((x) -> {
			System.out.println(x);
		});

		Predicate<Integer> pi = null;
		// Predicate
		List<Integer> odd = list.stream().filter((x) -> {
			return x % 2 == 0;
		}).collect(Collectors.toList());

		System.out.println(list);
		System.out.println(odd);

		list.stream().mapToInt((x) -> {
			return x * x;
		}).forEach(x -> System.out.println(x));
		;

		// Function -> T->process->ans[R] R apply(T)
		Function<Integer, Integer> fii = null;

		list.stream().mapToInt(x -> x).sum();

		Sum s = new Sum();
		Thread t = new Thread(s);
		t.start();

		Thread x = new Thread(() -> {
			System.out.println("run from sum2");
		});
		x.start();

		System.out.println("done");
	}
}

class Sum implements Runnable {

	public void run() {
		System.out.println("run from sum");
	}
}