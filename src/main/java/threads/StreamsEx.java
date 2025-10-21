package threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx {
	public static void main(String[] args) {
		
		List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Dileep", "Rajesh", "Sam", "Naresh"),
				Arrays.asList("Java", "Python"));

		System.out.println(nestedNames);
		nestedNames.stream().flatMap(fMap -> fMap.stream()).forEach(s -> System.out.println(s));
		
		
		
//		List<String> modifiedValues = names.stream().filter(f -> f.contains("e")).map(m -> m.concat(" Software Engineer")).collect(Collectors.toList());;
//		System.out.println(modifiedValues);
//		
//		System.out.println(names);
	}
}

//[1,2,3,4] -> stream() -> intermediate op -> filter(), map(), flatMap(), sorted(), distinct()

//Terminal op -> forEach(), count(), collect(), reduce()
