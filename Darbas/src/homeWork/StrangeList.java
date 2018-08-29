package homeWork;

import java.util.ArrayList;

public class StrangeList<E>{

	ArrayList<StrangeList> naujas = new ArrayList<>();

	public StrangeList(ArrayList<StrangeList> naujas) {
		this.naujas = naujas;
	}

	public ArrayList<StrangeList> getNaujas() {
		return naujas;
	}

	public void setNaujas(ArrayList<StrangeList> naujas) {
		this.naujas = naujas;
	}
	
	
	
	
	
}
