package bandymas;

public class Terminatorius {
	
	private String text;
	
	public Terminatorius(String text) {
		this.text = text;
	}

	public void writeText(String text) {
		System.out.println(text);
	}
	public String toString() {
		return text;
	}
}
