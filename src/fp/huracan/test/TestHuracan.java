package fp.huracan.test;

import java.util.Scanner;

import fp.huracan.Huracan;

public class TestHuracan {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la velocidad del viento en km/h : ");
		Float a= sc.nextFloat();
		
		Integer m = Huracan.categoria(a);
		if (m>0) {
			System.out.println("La categoria del huracan es: " + m);	
		}
		
		else {
			System.out.println("No hay huracan");	
		}sc.close();

	}



}
