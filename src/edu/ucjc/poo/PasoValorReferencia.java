package edu.ucjc.poo;

import edu.ucjc.poo.ejercicios.ejercicio1.Alumno;

public class PasoValorReferencia {

	// Paso por referencia (no tipos primitivos)
	private static void modificaAlumno(Alumno alumno) {
		alumno.setNombre("NombreAlumno1");
		System.out.println(alumno.getNombre());
	}

	// Paso por valor (siempre en los tipos primitivos)
	private static void multiplica(int numero) {
		numero *= 2;
		System.out.println(numero);
	}

	private static double cuadradoNumero(double numero) {
		numero = Math.pow(numero, 2);
		return numero;
	}
	
	public static void main(String[] args) {
		//Paso por valor
		int numero = 3;
		multiplica(numero);
		System.out.println("numero: " + numero);
		
		//Paso por referencia
		Alumno alumnoTest = new Alumno("Nombre1", "Apwçe1", 12, "1111A");
		modificaAlumno(alumnoTest);
		System.out.println("alumno: " + alumnoTest.getNombre());

		//Paso por valor
		int numero2=7;
		double resultado = cuadradoNumero(numero2);
		System.out.println(numero2);
		System.out.println(resultado);
		
		
	}

}
