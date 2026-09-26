package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class LegacyCalendarExample {
	
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = Date.from(Instant.parse("2026-09-26T15:27:02Z"));
		
		System.out.println(dateFormat.format(date));
		
		// Podemos utilizar objetos da classe Calendar para manipular objetos da classe Date
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		
		date = calendar.getTime();
		System.out.println("date alterada: " + dateFormat.format(date));
		
		// Através da referência setada no calendar de date, podemos também acessar as informações de tempo
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // Retorna de 0 a 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		System.out.println("Ano: " + year);
		System.out.println("Mês: " + month);
		System.out.println("Dia do Mês: " + dayOfMonth);
		System.out.println("Horas: " + hours);
		System.out.println("Minutos: " + minutes);
		System.out.println("Segundos: " + seconds);
	}
}
