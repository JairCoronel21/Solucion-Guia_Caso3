package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		int s = 0, i = 1;
		
		while (i <= n) {
		      s += i;
		      i++;
		}

		System.out.println("\nResultados");
		System.out.println("---------");
		System.out.println("La sumatoria de " + n + " es: " + s);
		
	}

}
