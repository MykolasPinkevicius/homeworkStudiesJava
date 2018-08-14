package tries;

import java.util.Arrays;
import java.util.Comparator;

public class sorting {

	public static void main(String[] args) {
		System.out.print("Sorting_Demo");
		System.out.println();
		
		String[] vals = new String[] {
			"white", "brown", "yellow", "blue", "aaaaaaaaa", "red", "pink", "black"
		};
		
		System.out.printf("Original: %s\n", Arrays.toString(vals));
		System.out.println();
		
		String[] newValsV1 = sortByStringLengthV1(vals);
		System.out.printf("V1: %s\n", Arrays.toString(newValsV1));
		
		String[] newValsV2 = sortByStringLengthV2(vals);
		System.out.printf("V2: %s\n", Arrays.toString(newValsV2));
		
	}
		
		static String[] sortByStringLengthV1 ( String[] vals ) {
			
			String[] result = Arrays.copyOf(vals, vals.length);
			
			Arrays.sort(result, new LengthComparer() );
			
			return result;
		}
		static String[] sortByStringLengthV2 ( String[] vals ) {
			return Arrays.stream(vals)
					.sorted(new LengthComparer())
					.toArray(String[]::new);
		}
	}

class LengthComparer implements Comparator<String>{
	@Override
	public int compare(String x, String y) {
		
		if (x == null && y == null)
			return 0;
		
		if (x == null)
			return -1;
		if (y == null)
			return 1;
		
		int result = x.length() - y.length();
		
		if ( result == 0 ) {
			result = x.compareTo(y);
		}
		
		return result;
	}
}
