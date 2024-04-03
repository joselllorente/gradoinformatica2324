package edu.ucjc.programacion.ejercicios.bucles;

public class EjercicioBucleFor {

	public static void main(String[] args) {
		//Mostrar los numeros pares del 0 al 100
		for (int i=0;i<=100;i+=2) {
			System.out.println(i);
//			if(i%2==0) {
//				System.out.println(i);
//			}
		}
		
		System.out.println("=====================");
		//Mostrar en la misma línea los numeros impares del 1 al 100 
		//y los pares del 100 al 1
		for(int i=1, j=100; j>=2 ; i+=2,j-=2 ) {
			System.out.println(i + "-" + j );
		}

	}

}
