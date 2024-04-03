package edu.ucjc.utilidades;

import java.util.Scanner;

public class Utilidades {
	
	public static void validarEmail (String email) {
		boolean isValido = true;
		String mensaje = "";
		email = email.trim();
		System.out.println(email);
		if (email.contains(" ")) {
			isValido = false;
			mensaje += "\n\tEl email no puede tener espacios en blanco";
		}
		
		if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@") ) {
			isValido = false;
			mensaje += "\n\tEl email tiene que tener una @";
		}else {
			String dominio = email.substring( email.indexOf("@") + 1 );
			System.out.println("dominio"+dominio);
			if (!dominio.contains(".") ) {
				isValido = false;
				mensaje += "\n\tEl email tiene que tener un punto después de la @";
			}else {//Si tiene punto después de la @ paso las siguientes validaciones
				if (dominio.indexOf(".")<2) {
					isValido = false;
					mensaje += "\n\tEl email tiene que tener una distancia mayor de dos con la @";
				}
				String subdominio = dominio.substring(dominio.lastIndexOf(".")+1); 
				if (subdominio.length() < 2 || subdominio.length() > 5) {
					isValido = false;
					mensaje += "\n\tEl número de caracteres después del último punto debe estar entre 2 y 5";
				
				}	
			}
		}
		
		if(!isValido) {
			System.out.println("El email "+ email + " no es valido "+mensaje);
		}else {
			System.out.println("El email es correcto");
		}
		
	}
	
	
	public static  int pideDatoEntero(String texto) {
		int numero = 0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		
		return numero;
	}
	
	
	public static String pideDatoString(String texto) {
		String dato="";
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextLine();
		
		return dato;
	}
	
	public static void pintarMenu(String [] opciones) {
		for (String opcion : opciones) {
			System.out.println(opcion);
		}
		
	}
	
	
}
