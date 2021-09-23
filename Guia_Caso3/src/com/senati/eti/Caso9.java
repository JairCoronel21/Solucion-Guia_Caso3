package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cl1 = null;
		String alumno, pr, rs, cl2 = "";
		float nota, asistencia, promedio, porcentaje, num_mayor, num_menor = 0;
		int a, b, c, d = 0;
		a = 0; b = 0; c = 0; d = 0;
		num_mayor = 0; num_menor = 99999999;
		pr = "S";
		
		int nota2, nota3 = 0;
		
		while (pr.equals("S") || pr.equals("s")) {
			a++;
			System.out.println("----------------");
			System.out.println("Registro N. " + a);
			System.out.println("----------------");
			
			System.out.println("Nombre del alumno: "); 
			alumno = sc.nextLine();
			
			System.out.println("Ingrese la nota 1.....:");
			nota = sc.nextInt();
			
			System.out.println("Ingrese la nota 2.....:");
			nota2 = sc.nextInt();
			
			System.out.println("Ingrese la nota 3.....: ");
			nota3 = sc.nextInt();
			
			System.out.println("Asistencia [1 - 12]: ");
			asistencia = sc.nextInt();
			
			promedio = (nota * 0.2f) + (nota2 * 0.3f) + (nota3 * 0.5f);
			porcentaje = (asistencia / 0.12f);
			
			System.out.println("**********");
			System.out.println("Resultados");
			System.out.println("**********");
			
			if ((promedio >= 13) && (porcentaje >= 70)) {
				rs = "Obtiene Certificado";
				b++;
			}
			else {
				rs = "Sin Certificado";
				c++;
			}
			System.out.println("Promedio: "+ promedio);
			System.out.println("Asisitencias: "+ porcentaje + " %");
			System.out.println("Estado:  " +  rs);
			
			
			if (promedio > num_mayor) {
				num_mayor = promedio;
				cl1 = alumno;
			}
			
			if 	(promedio < num_menor) {
				num_menor = promedio;
				cl2 = alumno;
			}
			  
			sc.nextLine();
			System.out.println("¿Desea registar otro participante? <S/N>:");
			pr = sc.nextLine();
			
			}
		
		 System.out.println("****************");
		 System.out.println("\nResumen");
		 System.out.println("****************");
		 System.out.println("Número de alumnos: "+ a);
		 System.out.println("Mayor promedio: "+ num_mayor +" Pertenece a: "+ cl1);
		 System.out.println("Menor promedio: "+ num_menor +" Pertenece a: "+ cl2);
		 System.out.println("Numero de alumnos con certificado: "+ b);
		 System.out.println("Numero de alumnos con certificado: "+ c);
		 
		
		
		}
		
		
	}

	


