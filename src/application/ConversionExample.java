package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversionExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2026-09-25");
		LocalDateTime localDateTime = LocalDateTime.parse("2026-09-25T01:20:00");
		Instant globalDate = Instant.parse("2026-09-25T01:20:00Z");
		
		// Convertendo Data-Hora Global para Local
		LocalDate result1 = LocalDate.ofInstant(globalDate, ZoneId.systemDefault());
		LocalDate result2 = LocalDate.ofInstant(globalDate, ZoneId.of("Portugal"));
		LocalDateTime result3 = LocalDateTime.ofInstant(globalDate, ZoneId.systemDefault());
		LocalDateTime result4 = LocalDateTime.ofInstant(globalDate, ZoneId.of("Portugal"));
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		
		System.out.println();
		
		// Extraindo dados (ano, mês, dia, horário) de uma Data-Hora local
		System.out.println("Dia de localDate: " + localDate.getDayOfMonth());
		System.out.println("Mês de localDate: " +  localDate.getMonthValue() + " / " + localDate.getMonth());
		System.out.println("Ano de localDate: " + localDate.getYear());
		
		System.out.println("Horas de localDateTime: " + localDateTime.getHour());
		System.out.println("Minutos de localDateTime: " + localDateTime.getMinute());
		
		System.out.printf("Horário de localDateTime: %02d:%02d:%02d", localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
	}
}
