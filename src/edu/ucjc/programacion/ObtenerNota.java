package edu.ucjc.programacion;

import java.util.Scanner;

/*
 * 
 * Crear una clase ObtenerNota
Declarar e inicializar una variable de tipo entero con un valor entre 1 y 10
Si el valor esta entre 1 y <5 --> Suspenso
Si el valor esta entre 5 y <7 --> Aprobado
Si el valor esta entre 7 y <9 --> Notable
Si el valor esta entre 9 y 10 --> Sobresaliente
Si el valor no esta en el rango de 1 a 10, la nota es incorrecta
Hacerlo con el if y con switch
 */

public class ObtenerNota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota = scan.nextInt();

		// Con if
		if (nota > 0 && nota < 5) {
			System.out.println("Suspenso");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Aprobado");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Nota introducida incorrecta");
		}

		System.out.println("=============================");
		switch (nota) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota no valida");
			break;

		}

	}

}
