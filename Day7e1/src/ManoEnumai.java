import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManoEnumai{
	
		public static void main (String ... args) {
			
			List<MyCitties> cit = new ArrayList<>();
			
			Collections.sort(cit, new CittieComparator());
			
			
			// Per fora sudedu informacija i lista MyCitties
		for (MyCitties city : MyCitties.values()) {
			cit.add(city);
//			System.out.println(city + " " + city.getMiestuDydis()); 
		}
		Collections.sort(cit, new CittieComparator());
		for(MyCitties val : cit) {
			System.out.println(val + " " + val.getMiestuDydis());
		}
			
		
		
	}
//		public enum MyCitties {
//			ALYTUS(40), KAUNAS(100), VILNIUS(300), PANEVEZYS(50);
//			
//			public int miestuDydis;
//			
//			private MyCitties(int miestuDydis) {
//				this.miestuDydis = miestuDydis;
//			}
//			public int getMiestuDydis() {
//				return miestuDydis;
//			}		
//			
//	}
		
}

