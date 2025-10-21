package threads;

import java.util.function.Function;

public class FunctionInterfaceEx {
	public static void main(String[] args) {
		Function<String, Integer> fun = (String name) -> {
			return name.length();
		};
		
		System.out.println(fun.apply("Dileep"));
	}
}


//predicate
//function
//supplier
//Runnable
// Consumer