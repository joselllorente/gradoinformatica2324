package edu.ucjc.programacion.arrays;

public class PruebaArrays {

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3,4};
		System.out.println(numeros[4]);
		
		int [] numeros2 = new int[6];
		
		//numeros2 = numeros;
		
		numeros2[2]=4;
		System.out.println(numeros2[2]);

		System.out.println(numeros2.length);
		System.out.println(numeros.length);
		
		
		String [][] nombres = new String[2][3];
		nombres[1][1]="Hola";
		System.out.println(nombres[0][1]);
	}

}
