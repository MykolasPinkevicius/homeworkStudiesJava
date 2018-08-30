package naDarb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @
 * @author mykolaspinkevicius
 *
 */
public class Mainer {

	public static void main(String[]args) {
		
		Path from = Paths.get(args[0]);
		List<String> vString = new ArrayList<>();
		List<Path> vPath = new ArrayList<>();
		
		try (Stream<Path> ctrlC = Files.walk(from)) {
			List<Path> cPath = ctrlC.collect(Collectors.toList());
			for (Path c : cPath) {
				vString.add(c.toString().replaceAll(args[0],args[1] ));
			}
			for (String s : vString) {
				vPath.add(Paths.get(s));
			}
			for (int i = 0; i < vString.size(); i++) {
				Files.copy(cPath.get(i), vPath.get(i));
			}
		}
			catch (IOException e) {
				System.out.println(e);
			}
			
		}
		
	}
