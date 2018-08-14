package lt.baltictalents;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Work {

	/*
	 * Susikurkite failą su kažkokiu turiniu iš interneto (wikipedijos) ir
		parašykite programą, kuri išveda žodžius panaudotus tame tekste ir
		kiek kartų tas žodis buvo panaudotas žodžių panaudojimo mažėjimo
		tvarka. Pastaba: didžiosios - mažosios raidės laikomos tokiomis pat,
		t.y. žodžiai Wikipedia ir wikipedia yra tas pats žodis.
	 */
	
	
	public static void main (String ...args) throws Exception {
		
//		Kurmis Vladukas = new Kurmis("Moles are small mammals adapted to a subterranean lifestyle (i.e., fossorial). They have cylindrical bodies; velvety fur; very small,\n inconspicuous ears and eyes; reduced hindlimbs; and short, powerful forelimbs with large paws adapted for digging. The term mole is especially and most properly \n used for true moles of the Talpidae family in the order Eulipotyphla found in most parts of North America, Asia, and Europe; although it may also refer to other \n unrelated mammals of Australia and southern Africa which have similarly evolved the mole body plan. The term is not applied to all talpids; e.g. desmans and \n shrew-moles differ from the common definition of mole.");
//		System.out.println(Vladukas);
//		
		readTextFile();
		
	}
	private static void readTextFile() throws Exception {
		File file = new File("Resources/Mole.txt");
		
		if (file.exists() && file.isFile()) {
			try (BufferedReader reader = new BufferedReader(
					new FileReader(file))) {
				
				String line = reader.readLine();
				System.out.println(line);
			}
		} else {
			throw new Exception("Not a file");
		}
	}
	
}
