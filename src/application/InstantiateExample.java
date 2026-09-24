package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantiateExample {
	
	public static void main(String[] args) {
		// Instanciação
		
		// agora => Data-hora
		LocalDate localDate1 = LocalDate.now();
		LocalDateTime localDate2 = LocalDateTime.now();
		Instant globalDate = Instant.now();
		
		System.out.println("localDate1 = " + localDate1);
		System.out.println("localDate2 = " + localDate2);
		System.out.println("globalDate = " + globalDate);
		
		System.out.println("\n=============================\n");
		
		// texto => Data-hora, seguindo Padrão ISO 8601
		LocalDate textLocalDate1 = LocalDate.parse("2026-09-24"); 
		LocalDateTime textLocalDate2 = LocalDateTime.parse("2026-09-24T14:14:21");
		
		Instant textGlobalDate1 = Instant.parse("2026-09-24T17:14:21Z"); // Timezone GMT
		Instant textGlobalDate2 = Instant.parse("2026-09-24T14:14:21-03:00"); // Timezone GMT-3 (ou SP)
		
		System.out.println("textLocalDate1 = " + textLocalDate1);
		System.out.println("textLocalDate2 = " + textLocalDate2);
		System.out.println("textGlobalDate1 = " + textGlobalDate1);
		System.out.println("textGlobalDate2 = " + textGlobalDate2);
		
		System.out.println("\n=============================\n");
		
		// texto => Data-hora, formato customizado
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate customTextLocalDate1 = LocalDate.parse("24/09/2026", formatter1);
		LocalDateTime customTextLocalDate2 = LocalDateTime.parse("24/09/2026 01:30", formatter2);
		
		System.out.println("customTextLocalDate1 = " + customTextLocalDate1);
		System.out.println("customTextLocalDate2 = " + customTextLocalDate2);
		
		System.out.println("\n=============================\n");
		
		// parâmetros => Data-hora
		LocalDate paramsLocalDate1 = LocalDate.of(2026, 9, 24);
		LocalDateTime paramsLocalDate2 = LocalDateTime.of(2026, 9, 24, 14, 52, 33);
		
		System.out.println("paramsLocalDate1 = " + paramsLocalDate1);
		System.out.println("paramsLocalDate2 = " + paramsLocalDate2);
	}
}
