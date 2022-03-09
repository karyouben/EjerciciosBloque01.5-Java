package fp.hotel.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import fp.hotel.Hotel;
import fp.hotel.Temporada;

public class TestHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la fecha con formato dd/mm/yyyy : ");
		String a= sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date testDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate b = LocalDate.parse(a, formatter);
		try {
			 testDate = df.parse(a);
	        } catch (Exception e){ System.out.println("invalid format");}
			
		  if (!df.format(testDate).equals(a)){
            System.out.println("invalid date!!");
		} else {
            System.out.println("valid date");
		}
		
		Temporada temporada = Hotel.calculaTemporada(b);
		System.out.println("La temporada del hotel es: " + temporada);
		sc.close();
	
		}

	}

