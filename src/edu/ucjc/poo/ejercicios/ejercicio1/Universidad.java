package edu.ucjc.poo.ejercicios.ejercicio1;

import edu.ucjc.utilidades.Utilidades;

public class Universidad {

	public static void main(String[] args) {
		Math.random();
		
		Alumno alumno1 = new Alumno("Alumno1","Apellido1",20,"Informática",1);
		String [] asignaturasAlumno1 = {"Asignatura1","Asignatura2","Asignatura3"};
		alumno1.setAsignaturas(asignaturasAlumno1);
		alumno1.setEmail("alumno1.email@email.es");
		
		alumno1.mostrarInfoAlumno();
		
		String [] asignaturasAlumno2 = new String[3];
		asignaturasAlumno2[0]="Asignatura1";
		asignaturasAlumno2[1]="Asignatura2";
		
		Alumno alumno2 = new Alumno("Alumno2","Apellido2",21,"Informática",3, asignaturasAlumno2);
		alumno2.mostrarInfoAlumno();
		
		Alumno alumno3 = new Alumno("Alumno3","Apellido3",20,"Informática",2);
		alumno3.mostrarInfoAlumno();
		
		Alumno [] alumnos = {alumno1,alumno2,alumno3};
		
		for (Alumno alumno : alumnos) {
			System.out.println("Validamo email del alumno "+alumno.getNombre());
			
//			String emailAlumno = alumno.getEmail();
			if (alumno.getEmail()!=null) {
				//validarEmail();
				metodo1();
				alumno.validarEmail();
//				Universidad uni = new Universidad();
//				uni.validarEmail(alumno.getEmail());
				//validarEmail(alumno.getEmail());
				Utilidades.validarEmail(alumno.getEmail());
				System.out.println(Math.random());
			}else {
				System.out.println("EL alumno "+alumno.getNombre() + " no tiene email");
			}
		}
		
//		System.out.println(alumnos[0]);
//		System.out.println(alumno1);
		
		
	}
	
	private static void metodo1() {
		System.out.println("metodo1");
	}
	
	private  void validarEmail (String email) {
		metodo1();
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

}
