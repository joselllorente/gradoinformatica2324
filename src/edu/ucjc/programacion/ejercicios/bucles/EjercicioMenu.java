package edu.ucjc.programacion.ejercicios.bucles;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("\n1. Matriz numeros");
			System.out.println("2. Cuadrado");
			System.out.println("3. Fibonnacci");
			System.out.println("4. Salir");
			
			System.out.println("Introduce una opcion");
			opcion = scan.nextInt();
			switch(opcion) {
				case 1: 
					for(int i=1;i<10;i++) {
						System.out.print(i+"\t");
						if (i%3==0) {
							System.out.print("\n");
							//System.out.println();
						}
					}
					
					break;
				case 2: 
					int tamanio = 4;
					for (int i=0;i<tamanio;i++) {
						for(int j=0;j<tamanio;j++) {
							if (i==0 || i==tamanio-1) {
								System.out.print("*\t");
							}else {
								if(j==0 || j==tamanio-1) {
									System.out.print("*\t");
								}else {
									System.out.print("\t");
								}
							}
						}
						System.out.print("\n");
						//System.out.println("");
					}
					
					
					break;
				case 3: 
					System.out.println("Cuántos números de la serie de Fibonacci quieres mostrar?");
					int cantidadNumeros = scan.nextInt();
					int num1 = 0;
					int num2 = 1;
					System.out.println(num1);
					System.out.println(num2);
					
					for (int i=0;i<cantidadNumeros-2;i++) {
						int suma = num1+num2;
						num1 = num2;
						num2 = suma;
						System.out.println(suma);
						
					}
					
					break;
				case 4: System.out.println("Adios!!");break;
				default: System.out.println("Opción incorrecta");break;
			}
			//System.out.println(opcion);
		}while(opcion!=4);
	}

}
