package listAdding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainer {

	public static void main(String[]args) {
		
	List <Integer> hei = new ArrayList();
			hei.add(3);
			hei.add(4);
			hei.add(5);
			hei.add(3);
			hei.add(4);
			hei.add(5);
			hei.add(3);
			hei.add(4);
			hei.add(5);
			hei.add(3);
			hei.add(4);
			hei.add(5);
			
			Collections.sort(hei);
			System.out.println(hei);
			
	Map <String, Double> heiMap = new HashMap<String, Double>();
	heiMap.put("Black", 2.0);
	heiMap.put("White", 2.5);
	heiMap.put("Cappuccino", 3.0);
	heiMap.put("Latte", 3.5);
	heiMap.put("Americano", 2.5);
	
	System.out.println(heiMap.size());
	}
	
}
