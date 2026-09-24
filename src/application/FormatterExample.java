package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatterExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2026-09-24");
		LocalDateTime localDateTime = LocalDateTime.parse("2026-09-24T15:33:12");
		Instant globalDate = Instant.parse("2026-09-24T15:33:12Z");
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// O objeto formatter pode ser utilizado para alterar como o objeto de Data-Hora irá ser mostrado em String
		System.out.println("localDate = " + localDate.format(formatter1));
		System.out.println("localDate = " + formatter1.format(localDate));
		System.out.println("localDate = " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("localDateTime = " + localDateTime.format(formatter1));
		System.out.println("localDateTime = " + localDateTime.format(formatter2));
		
		// Para escrever na tela do usuário uma Data-Hora global é necessário levar em consideração o valor do fuso-horário
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		
		// Como o objeto Instant não possui um método público "format", utilizamos apenas o próprio objeto formatter
		System.out.println("globalDate = " + formatter3.format(globalDate));
	
		// Utilizando Formatters pré-definidos
		System.out.println("localDateTime [ISO_DATE_TIME] = " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		
		System.out.println("globalDate [ISO_INSTANT] = " + DateTimeFormatter.ISO_INSTANT.format(globalDate));
		
		final DateTimeFormatter ISO_DATE_TIME_WITH_ZONEID = DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.systemDefault());
		System.out.println("globalDate [ISO_DATE_WITH_ZONEID] = " + ISO_DATE_TIME_WITH_ZONEID.format(globalDate));
	}
}
