package threads;

import java.util.function.Predicate;

public class PredicateInterface {
	public static void main(String[] args) {
		Predicate<Integer> pre = (Integer number) -> number % 2 == 0;
		System.out.println(pre.test(1001));
	}
}
