import java.util.Comparator;

public class CittieComparator implements Comparator<MyCitties> {

	@Override
	public int compare(MyCitties o1, MyCitties o2) {
		
		if ( o1.getMiestuDydis() > o2.getMiestuDydis()) {	
			
			return 1;
			
		} else if (o1.getMiestuDydis() < o2.getMiestuDydis()) {
			
			return -1;
			
		} else {
			
			return 0;
		}
	
	}

}
	

