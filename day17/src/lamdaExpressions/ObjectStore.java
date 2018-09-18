package lamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectStore<E> {

	private List<E> collection;
	
	public ObjectStore() {
		collection = new ArrayList<>();
	}
	
	public void add(E obj) {
		collection.add(obj);
	}
	
	public List<E> getElements() {
		return Collections.unmodifiableList(collection);
	}
	
	public void reverseOrder() {
		Collections.reverse(collection);
	}
	
}
