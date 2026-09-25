package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantiateExample {
	
	public static void main(String[] args) {
		// Instanciação
		
		// agora => Data-hora
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		Instant globalDate = Instant.now();
		
		System.out.println("localDate = " + localDate);
		System.out.println("localDateTime = " + localDateTime);
		System.out.println("globalDate = " + globalDate);
		
		System.out.println("\n=============================\n");
		
		// texto => Data-hora, seguindo Padrão ISO 8601
		LocalDate textLocalDate = LocalDate.parse("2026-09-24"); 
		LocalDateTime textLocalDateTime = LocalDateTime.parse("2026-09-24T14:14:21");
		
		Instant textGlobalDate1 = Instant.parse("2026-09-24T17:14:21Z"); // Timezone GMT
		Instant textGlobalDate2 = Instant.parse("2026-09-24T14:14:21-03:00"); // Timezone GMT-3 (ou SP)
		
		System.out.println("textLocalDate = " + textLocalDate);
		System.out.println("textLocalDateTime = " + textLocalDateTime);
		System.out.println("textGlobalDate1 = " + textGlobalDate1);
		System.out.println("textGlobalDate2 = " + textGlobalDate2);
		
		System.out.println("\n=============================\n");
		
		// texto => Data-hora, formato customizado
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate customTextLocalDate = LocalDate.parse("24/09/2026", formatter1);
		LocalDateTime customTextLocalDateTime = LocalDateTime.parse("24/09/2026 01:30", formatter2);
		
		System.out.println("customTextLocalDate = " + customTextLocalDate);
		System.out.println("customTextLocalDateTime = " + customTextLocalDateTime);
		
		System.out.println("\n=============================\n");
		
		// parâmetros => Data-hora
		LocalDate paramsLocalDate = LocalDate.of(2026, 9, 24);
		LocalDateTime paramsLocalDateTime = LocalDateTime.of(2026, 9, 24, 14, 52, 33);
		
		System.out.println("paramsLocalDate = " + paramsLocalDate);
		System.out.println("paramsLocalDateTime = " + paramsLocalDateTime);
	}
}
