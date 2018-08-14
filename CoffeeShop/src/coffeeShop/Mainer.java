package coffeeShop;

import java.util.*;
import java.util.Map.Entry;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Mainer {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("src/coffeeShop/Mole.txt")); // sukuriam skaneri
		List<String> stringList = new ArrayList<>(); // sukuriam arraylista

		while (sc.hasNext()) { // kol skaneris mato stringa ideda po nauja stringa
			stringList.add(sc.next());
		}
		sc.close();// baigiam skenuoti
		String[] newArray = new String[stringList.size()]; // sukuriam areju su stringlist size
		Map<String, Integer> mapas = new TreeMap<>();
		for (int i = 0; i < stringList.size(); i++) { // foras ismeta pagal regex nurodytus nereikalingus simbolius ir
														// ideda i nauja areju modifikuotis stringus
			newArray[i] = stringList.get(i).replaceAll("([,.;:\"'-()\\s])", "");
		}

		for (int i = 0; i < newArray.length; i++) { // Jis tikrina i indexa su j indexu patikrina ju reiksmes jeigu jos atitinka viena kitai tada jis deda i mapa ir kiek kartu tas zodis buvo panaudotas
			int count = 1;
			for (int j = 0; j < newArray.length; j++) {
				String newWord = newArray[i].toLowerCase();
				if (newWord.compareToIgnoreCase(newArray[j]) == 0) {
					mapas.put(newWord, count++); // idedame reiksmes i savo mapa
				}
			}
		}

		Map<String, Integer> sortedByQuantity = sortByValue(mapas); // panaudojame inline komparatoriu sulyginti reiksmem
//		sortedByQuantity.forEach((k,v) -> System.out.println("\"" + k + "\"" + " used " + v + " times "));

		for (Map.Entry<String, Integer> entry : sortedByQuantity.entrySet()) { // Atspauzdinam reiksmes ir redaguojam kaip spauzdinti
			System.out.println("\"" + entry.getKey() + "\"" + " used " + entry.getValue() + " times ");
		}

		// Dabar padaryk kad jis butu unikalus

		// paskaiciuoti kiek kartu jis buvo panaudotas

		// to lowercase kad visi stringai butu mazosiom raidem

		// atspauzdinti stringa mazejant pagal panaudotus zodzius.
	}

	private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {   // Isidedam metoda kuris komparuoja mapa pagal reiksmes.
		List<Entry<K, V>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Object>() {
			@SuppressWarnings("unchecked")
			public int compare(Object o1, Object o2) {
				return ((Comparable<V>) ((Map.Entry<K, V>) (o2)).getValue())
						.compareTo(((Map.Entry<K, V>) (o1)).getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<>();
		for (Iterator<Entry<K, V>> it = list.iterator(); it.hasNext();) {
			Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}
}
