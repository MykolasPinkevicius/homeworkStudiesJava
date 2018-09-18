package lamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class Bliambda {
	
	private static List<String> stringai = Arrays.asList("A", "B", "C");
	
	public static void main(String args []) {
		
		stringai
			.stream()
			.forEach(s -> {
				System.out.println(s.equals("A"));
			});
	}

	
	
	private static <T> void callFunction(Comparable<T> compare, T next) {
		compare.compareTo(next);
	}
}
