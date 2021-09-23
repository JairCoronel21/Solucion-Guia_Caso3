package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  empl1 = null;
        String empl2 = null;
		String empleado, z,  tarde = "";
		int a, b, c, d = 0;
		float snpeor, snmejor, mintarde = 0;
		a = 0;  b = 0;  c = 0;  d = 0;
		snmejor  = 0;   snpeor = 999999999; 
		mintarde = 0; tarde = "";
		int hora, min, tarifa = 0;
		float sbruto, bono, descuento, sneto, meta = 0;
		
		z = "S";
		while (z.equals("S") || z.equals("s")) {
			a++;
			System.out.println("***************************");
			System.out.println("Registro de Empleados " + a);
			System.out.println("***************************");
			
			System.out.println("Nombre del empleado: "); 
			empleado = sc.nextLine();
			
			
			System.out.println("Ingrese las horas trabajadas:");
			hora = sc.nextInt();
			
			System.out.println("Ingrese la tarifa por hora:");
			tarifa = sc.nextInt();
			
			System.out.println("Ingrese los minutos de tardanza:");
			min = sc.nextInt();
			
			
			System.out.println("**********");
			System.out.println("Resultados");
			System.out.println("**********");
			
			sbruto = (hora * tarifa);
			
			if (hora <= 50) {
				bono = 0;
				b = b + 1;
			}else if ((hora > 50) && (hora <= 60)) {
				bono = (sbruto * 0.02f);
			}else if ((hora > 60) && (hora <= 70)) {
				bono = (sbruto * 0.08f);
			}else if ((hora > 70) && (hora <= 80)) {
				bono = (sbruto * 0.13f);
			}else {
				bono = (sbruto * 0.15f);
			}
		
			         
			if  (min <= 15) {
				descuento = 0;
				c++;
			}else if ((min > 15) && (min <= 30)) {
				descuento =  (0.003f * sbruto * min);
			}else {
				descuento = (0.005f * sbruto * min);
			}
			
			sneto = (sbruto + bono) - (descuento);
			meta = (hora / 0.80f);
			
			System.out.println("Nombre del empleado: " + empleado);
			System.out.println("Sueldo Bruto: " + sbruto);
			System.out.println("Bonificación: " + bono);
			System.out.println("Descuento: " + descuento);
			System.out.println("Sueldo neto: " + sneto);
			System.out.println("% Alcanzado: " + meta + " %");
			
			
			if (sneto > snmejor) {
				snmejor = sneto;
				empl1 = empleado;
			}
			
			if (sneto < snpeor) {
				snpeor = sneto;
				empl2 = empleado;
			}
			
			if (min > mintarde) {
				mintarde = min;
				tarde = empleado;
			}
			
			if (meta > 90 ) {
				d++;
			}
			sc.nextLine();
			System.out.println("¿Nuevo Empleado? <S/N>: ");
			z = sc.nextLine();
			
		}	
		System.out.println("--------------");
		System.out.println("Resumen");
		System.out.println("--------------");
		System.out.println("Número de empleados: "+ a);
		System.out.println("Sueldo neto mayor: "+ snmejor +" Pertenece a " + empl1);
		System.out.println("Sueldo neto menor: "+ snpeor +" Pertenece a "+ empl2);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza : "+ tarde +":("+ mintarde +"min)");
		System.out.println("Cantidad de empleados con mas del 90% de la meta: "+ d);
		
		
		
	}
}
		
		
	


