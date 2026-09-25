package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 * Exemplo com o intuito de entender a manipulaçã de Data-Hora usando as classes antes do Java 8+
 */
public class LegacyExample {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		dateFormat3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date date1 = dateFormat1.parse("25/09/2026");
		Date date2 = dateFormat2.parse("25/09/2026, 15:15:07");
		
		System.out.println("date1: " + dateFormat1.format(date1));
		System.out.println("date2: " + dateFormat2.format(date2));
		
		// Criando uma data no momento atual
		Date curDate1 = new Date(); 
		Date curDate2 = new Date(System.currentTimeMillis());
		
		System.out.println("curDate1: " + dateFormat2.format(curDate1));
		System.out.println("curDate2: " + dateFormat2.format(curDate2));
		
		// Criando através de um valor em milisegundos específico
		Date xDate1 = new Date(0L); // O valor é armazenado levando em consideração a meia noite (GMT) do dia 1 de janeiro de 1970
		Date xDate2 = new Date(1000L * 60L * 60L * 5L);
		
		System.out.println("xDate1: " + dateFormat2.format(xDate1));
		System.out.println("xDate2: " + dateFormat2.format(xDate2));

		// Utilizando padrão ISO 8601
		Date isoDate = Date.from(Instant.parse("2026-09-25T15:42:07Z"));
	
		System.out.println("isoDate: " + dateFormat3.format(isoDate));
	}
}
