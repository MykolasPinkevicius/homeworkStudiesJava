package Work12;

import java.io.IOException;
import java.io.Serializable;

public class Stalas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String spalva;
	public transient int aukstis;
	
	public Stalas(String spalva, int aukstis) {
	this.aukstis = aukstis;
	this.spalva = spalva;
	}

	public String getSpalva() {
		return spalva;
	}

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}

	public int getAukstis() {
		return aukstis;
	}

	public void setAukstis(int aukstis) {
		this.aukstis = aukstis;
	}

	@Override
	public String toString() {
		return "Stalas spalva:" + spalva + ", aukstis: " + aukstis;
	}
	
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeUTF(spalva + "asdghabsdjb");
	}
	
	
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		String spalva = in.readUTF();
		this.spalva = spalva.replace("asdghabsdjb", "");
	}
	
	
}
