package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperationsExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2026-09-25");
		LocalDateTime localDateTime = LocalDateTime.parse("2026-09-25T13:51:06");
		Instant globalDate = Instant.parse("2026-09-25T13:51:06Z");
	
		// Objetos Data-Hora são imutáveis, então precisamos gerar uma nova instância com base na anterior
		LocalDate pastWeekLocalDate =  localDate.minusWeeks(1);
		LocalDate nextWeekLocalDate = localDate.plusWeeks(1);
		LocalDate nextYearLocalDate = localDate.plusYears(1);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearLocalDate = " + nextYearLocalDate);

		LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = localDateTime.plusDays(7);
		LocalDateTime pastHalfHourLocalDateTime = localDateTime.minusMinutes(30);
		LocalDateTime nextHourLocalDateTime = localDateTime.plusHours(1);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("pastHalfHourLocalDateTime = " +  pastHalfHourLocalDateTime);
		System.out.println("nextHourLocalDateTime = " + nextHourLocalDateTime);
		
		Instant pastWeekGlobalDate = globalDate.minus(7, ChronoUnit.DAYS);
		Instant nextWeekGlobalDate = globalDate.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekGlobalDate = " + pastWeekGlobalDate);
		System.out.println("nextWeekGlobalDate = " + nextWeekGlobalDate);
		
		// Para gerar uma instância de duração entre LocalDates, precisamos convertê-los para LocalDateTime pois assim é possível ter acesso ao horário
		//Duration duration1 = Duration.between(pastWeekLocalDate.atTime(0, 0), localDate.atTime(0, 0));
		Duration duration1 = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());
		Duration duration2 = Duration.between(pastWeekLocalDateTime, localDateTime);
		
		// Duration consegue retornar um valor com sinal negativo / positivos (dias atrás / dias a frente)
		Duration duration3 = Duration.between(globalDate, pastWeekGlobalDate);
		
		System.out.println("duration1 (dias): " + duration1.toDays());
		System.out.println("duration2 (dias): " +  duration2.toDays());
		System.out.println("duration3 (dias): " + duration3.toDays());
	}
}
