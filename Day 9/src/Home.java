import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Home {

	public static void main(String[] args) {
		
		Locale local = new Locale("lt", "LT");
		Locale.setDefault(local);
		
		ResourceBundle bundle = ResourceBundle.getBundle("Elephants", Locale.getDefault());
		MessageFormat formatter = new MessageFormat(
				bundle.getString("1") + "\n" +
				bundle.getString("2") + "\n" +
				bundle.getString("3") + "\n" +
				bundle.getString("4") + "\n" +
				bundle.getString("5") + "\n" +
				bundle.getString("6") + "\n" +
				bundle.getString("7") + "\n" +
				bundle.getString("8") + "\n" +
				bundle.getString("9") + "\n" +
				bundle.getString("10") + "\n" +
				bundle.getString("11") + "\n" +
				bundle.getString("12") + "\n" +
				bundle.getString("13") + "\n" +
				bundle.getString("14") + "\n" +
				bundle.getString("15") + "\n" +
				bundle.getString("16") + "\n" +
				bundle.getString("17") + "\n" +
				bundle.getString("18") + "\n" +
				bundle.getString("19") + "\n"
				);
				System.out.print(
				formatter.format(new Object[] {}));
	
	}
	
}
