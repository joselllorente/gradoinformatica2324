package edu.ucjc.programacion.bucles;

public class WhileDoWhile {

	public static void main(String[] args) {
		System.out.println("Hola1");
		System.out.print("Hola2");
		System.out.print("Hola3\n");
		System.out.println("\tHola4");
		
		// While
		int numero=10;
		while(numero>7) {
			System.out.println(numero--);
		}
		
		System.out.println("================");
		//do-while, primero ejecuta y luego evalua la condición
		do {
			numero++;
			System.out.println(numero);
		}while(numero<20);

	}

}
