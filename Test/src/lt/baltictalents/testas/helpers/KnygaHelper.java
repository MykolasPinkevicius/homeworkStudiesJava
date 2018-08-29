package lt.baltictalents.testas.helpers;

import java.time.LocalDate;

import lt.baltictalents.testas.start.Knyga;
import lt.baltictalents.testas.start.Type;


public final class KnygaHelper{
	
	static LocalDate today = LocalDate.now();

	
	
	public static LocalDate getToday() {
		return today;
	}

	private KnygaHelper() {}
	
	public String findZanras(Type type) {
		return type.knygosTipas;
	}
	
	public static final int knygosAmzius(Knyga knyga) {
		String metai = getToday() + "";
		int dabartiniai = Integer.valueOf(metai.substring(0, 3));
		return dabartiniai - knyga.getMetai();
	}

	
}
