package edu.ucjc.programacion.ejercicios.arrays;


/*
 Crear un Array de Strings  con 3 emails. 
 Por cada email indicar si es valido o no tras pasar las siguientes validaciones:
	+ El email no puede tener espacios en blanco
	+ El email debe contener una @
	+ después de la @ tiene que haber al menos un punto
	+ La distancia entre la @ y el primer punto después de ésta tiene que ser superior a 2
	+ El número de caracteres después del último punto debe estar entre 2 y 5
 *
 **/
public class Ejercicio2 {

	public static void main(String[] args) {
		String [] emails = {" email 1@em.ail.es  ",
				" emai@l2e@mail.es",
				"email3email.es   ", 
				"asdas@asdasd",
				"urturytr@a.sdasd",
				"2urturytr@asdas.d",
				"3urturytr@as.dasasdasdasdd"};
		
		for (String email : emails) {
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
			}
		}
		
		
		
	}

}
