package edu.ucjc.programacion.ejercicios.arrays;

import java.util.Scanner;

/*
 * Crear una array de numeros enteros del tama�o que pid�is por consola, 
 * solicitar los numeros para las posiciones del array, 
 * y mostrar los n�meros pares del array
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el tama�o del array");
		int tamanioArray = scan.nextInt();
		
		int [] numeros = new int[tamanioArray];
		
		//Rellenar la informaci�n del array
		for (int i=0; i<tamanioArray;i++) {
			System.out.println("Introduce un valor para la posicion "+i);
			numeros[i] = scan.nextInt();
		}
		System.out.println("=======================================");
		for (int i=0; i<tamanioArray;i++) {
			int numero = numeros[i];
			if (numero %2==0) {
				System.out.println(numero);
			}
		}
		
		int [][] numeros2 = new int [2][3]; 
		
	}

}
