package edu.ucjc.programacion.bucles;

public class BucleFor {

	public static void main(String[] args) {
		int numero = 0;
		for ( int i=0 ; i<5 ; ++i  ) {
			
			System.out.println("El valor de i es"+i);
			numero = i;
			
		}
		numero*=3;
		System.out.println("Finaliza "+numero);
	}

}
