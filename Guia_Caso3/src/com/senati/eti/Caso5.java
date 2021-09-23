package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
			int n = 0, i = 1;
			int  num_menor = 99999999;
			
			while (i <= 5) {
				System.out.println("Ingrese número " + i + ": ");
				n = sc.nextInt();
				
				if (n < num_menor) 
					num_menor = n;
				   
				    		
				i++;
			  }
		
			
		
		
		System.out.println("\nResultados");
		System.out.println("-------------");
		System.out.println("El número menor  es: " + num_menor);
			
	}

	}

	

	
