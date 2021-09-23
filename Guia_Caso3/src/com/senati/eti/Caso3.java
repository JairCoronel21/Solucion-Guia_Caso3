package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int n = sc.nextInt();
		
		int i, s = 0;
		
		i = 1;
		s = 1;
		
		if (n >= 8 || n < 0)
		  System.out.println("El número es superior de 7 o negativo");
		  else
			  while (i <= n) {
		           s = s * i;
		           i = i + 1;
		        }
		System.out.println("El factorial de "+ n +" es : "+ s);
}

}