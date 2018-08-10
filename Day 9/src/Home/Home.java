package Home;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Home {

	private static void main(String[] args) {
		
		Locale local = new Locale("gb", "GB");
		Locale.setDefault(local);
		
		ResourceBundle bundle = ResourceBundle.getBundle("Elephants", Locale.getDefault());
		MessageFormat formatter = new MessageFormat(bundle.getString("message.hello"));
				System.out.print(
						formatter.format(new Object[] {}));
	
	}
	
}
