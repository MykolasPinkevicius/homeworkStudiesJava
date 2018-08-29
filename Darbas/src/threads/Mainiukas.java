package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mainiukas {

	public static void main(String[]args) {
		
		
		A first = new A();
		first.run();
		ArrayList alist = new ArrayList();
		B second = new B();
		second.run();
		ArrayList blist = new ArrayList();
		C third = new C();
		third.run();
		ArrayList clist = new ArrayList();
		D fourth = new D();
		ArrayList dlist = new ArrayList();
		fourth.run();
		E fifth = new E();
		fifth.run();
		ArrayList elist = new ArrayList();
		
		System.out.print(Runtime.getRuntime().availableProcessors());
	}
	
	static class A implements Runnable {
		@Override
		public void run() {
			ArrayList<Integer> alist = new ArrayList();
			int min = 0;
			int max = 101;
			for (int i = 0; i < 100; i++) {
			alist.add((int)(Math.random() * (max - min) + min));
			}
			Collections.sort(alist);
			Map<String, Integer> hasMap = new HashMap<>();
			for (int k : alist) {
				int count = 1;
				for (int a : alist ) {
					if (k == a) {
						hasMap.put(k+ "", count++);
					}
				}
			}
			Map<String, Integer> sortedMap = hasMap.entrySet().stream()
		            .sorted(Map.Entry.comparingByKey())
		            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
			hasMap.forEach((k, a)->System.out.println(k + " = " + a));
			sortedMap.forEach((k, a)-> System.out.println(k + " pasikartojo " + a));
			
		}
	}
	static class B implements Runnable {
		@Override
		public void run() {
			ArrayList<Integer> blist = new ArrayList();
			int min = 0;
			int max = 101;
			for (int j = 0; j < 100; j++) {
				blist.add((int)(Math.random() * (max - min) + min));
				}
		}
	}
	static class C implements Runnable {
		@Override
		public void run() {
			ArrayList<Integer> clist = new ArrayList();
			int min = 0;
			int max = 101;
			for (int k = 0; k < 100; k++) {
				clist.add((int)(Math.random() * (max - min) + min));
				}
		}
	}
	static class D implements Runnable {
		@Override
		public void run() {
			ArrayList<Integer> dlist = new ArrayList();
			int min = 0;
			int max = 101;
			for (int l = 0; l < 100; l++) {
				dlist.add((int)(Math.random() * (max - min) + min));
				}
		}
	}
	static class E implements Runnable {
		@Override
		public void run() {
			ArrayList<Integer> elist = new ArrayList();
			int min = 0;
			int max = 101;
			for (int m = 0; m < 100; m++) {
				elist.add((int)(Math.random() * (max - min) + min));
				}
		}
	}
	
}
