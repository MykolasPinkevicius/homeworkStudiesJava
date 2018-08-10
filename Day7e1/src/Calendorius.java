import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendorius {

	public static void main(String[]args) {
		
		LocalDate siandienosData  = LocalDate.now();
		siandienosData = siandienosData.minusMonths(50000).minusDays(50000);
		System.out.println(siandienosData);
		
		LocalDateTime siandienosLaikas = LocalDateTime.now();
		System.out.println("\n" +siandienosLaikas);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		System.out.println(siandienosLaikas.format(formatter));
		}
}
