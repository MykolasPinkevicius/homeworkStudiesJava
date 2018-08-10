package newList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class newListMain {

	public static void main(String[]args) {
		List<Integer> kintDebesis = new ArrayList<>();
		
		kintDebesis.add(56);
		kintDebesis.add(90);
		kintDebesis.add(900);
		kintDebesis.get(2);
		
		pridetiElementus(15, 44, 33, 98);
		
		Map<Integer, String> values = new HashMap<>();
		values.put(0, "Menulis");
		values.put(1, "Sakute");
		
		pridetiMapElementus(values);
		
		
		System.out.println(kintDebesis);
	}
	
	public static void pridetiElementus(Integer ... values) {
		List<Integer> kitoks = new ArrayList<>();
		for(Integer value : values) {
			kitoks.add(value);
		}
		System.out.println(kitoks);
		
	}
	
	public static void pridetiMapElementus(Map<Integer, String> dynamiskasMasyvas) {
		System.out.println(dynamiskasMasyvas.get(1));
	}
	
}
