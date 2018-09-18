package com.mykolaspinke;

import java.util.Locale;

import com.ibm.icu.text.RuleBasedNumberFormat;

public class App {
	public static void main (String[]args) {
		Locale location = new Locale(args[0], args[1].toUpperCase());
		RuleBasedNumberFormat formatter = new RuleBasedNumberFormat(location, RuleBasedNumberFormat.SPELLOUT);
		
		for	( int i = 1; i < args.length ; i++) {
			System.out.println(formatter.format(Integer.parseInt(args[i])));
		}
	}
}
