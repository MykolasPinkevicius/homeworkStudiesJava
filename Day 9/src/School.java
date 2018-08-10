import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class School {
	

	public static void main(String ... args) {
		Locale loc = new Locale("lt", "LT");
		Locale.setDefault(loc);
		
		ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.getDefault());
		MessageFormat formatter = new MessageFormat(bundle.getString("message.hello"));
		System.out.print(
				formatter.format(new Object[] {}));
		
//		System.out.println(bundle.getString("message.hello"));
		
		
//		System.out.println(loc);
		
//		Locale.Builder localBuilder = new Locale.Builder();
		
		
		printLokale();
		
		searchByRegex("rasaoo", "(asa)|(nana)");
		
//		useMessageFormat();
		
	}
	
//	private static void useMessageFormat() {
//		MessageFormat format = new MessageFormat("Cia bus musu {0} su pavarde {1} ");
////		format.format(10);
//		System.out.println(format.format(new Object[] {
//				"Vardenis", "Pavardenis"
//		}));
//	}
	
	private static void searchByRegex (String text, String pat) {
		
		Pattern pt = Pattern.compile(pat);
		
		Matcher match =  pt.matcher(text);
	
		match.find();
		
		System.out.println(match.group());
		
	}
	
	private static void printLokale() {
		
		NumberFormat numberF = NumberFormat.getCurrencyInstance();
		numberF.format(100);
		
		NumberFormat decimalF = DecimalFormat.getInstance();
		System.out.println(decimalF.format(656565656565L));
		String formattedNumber = numberF.format(100);		
		
		System.out.println(formattedNumber);
		
//		System.out.println(Locale.getDefault());
	}
}
