package edu.ucjc.poo.ejercicios.ejercicio2;

import edu.ucjc.poo.ejercicios.ejercicio1.Alumno;
import edu.ucjc.utilidades.Utilidades;

public class MenuUniversidadConMetodosSinMain {

	
	
	public static void main(String[] args) {
		int opcion = 0;

		MenuUniversidadConMetodosSinMain menu = new MenuUniversidadConMetodosSinMain();
		Alumno [] alumnos = null;
		do {
			String[] opciones = {"1. Crear Universidad","2. Insertar Alumnos","3. Mostra alumnos",
					"4. Buscar Alumno","5. Borrar Alumno", "6. Salir"};
			Utilidades.pintarMenu(opciones);
			opcion = Utilidades.pideDatoEntero("Selecciona una opcion");
			
			switch(opcion) {
				case 1: alumnos = menu.crearUniversidad(); break;
				case 2: menu.insertarAlumnos(alumnos); break;
				case 3: menu.mostrarAlumnos(alumnos); break;
				case 4: menu.buscarAlumno(alumnos); break;
				case 5: menu.borrarAlumno(alumnos);break;
				case 6: System.out.println("Adios!!");break;
				default: System.out.println("Opcion incorrecta");
			}
			
		}while(opcion!=6);
	}
	
	private Alumno[] crearUniversidad () {
		int numAlumnos = Utilidades.pideDatoEntero("Introduce n�mero de alumnos");
		Alumno[] alumnos = new Alumno[numAlumnos];
		System.out.println("Universidad creada con "+ alumnos.length + " alumnos");
		
		return alumnos;
		
	}
	
	private void insertarAlumnos (Alumno [] alumnosInsertar) {
		if (alumnosInsertar==null) {
			System.out.println("Debes crear la universidad en la opci�n 1");
		}else {//Rellenamos el array con objetos de tipo alumno
			
			for (int i=0 ; i<alumnosInsertar.length ; i++) {
				String nombre = Utilidades.pideDatoString("Introduce el nombre del alumno "+(i+1));
				String apellidos = Utilidades.pideDatoString("Introduce el apellido del alumno "+(i+1));
				String dni = Utilidades.pideDatoString("Introduce el dni del alumno "+(i+1));
				int edad = Utilidades.pideDatoEntero("Introduce la edad del alumno "+(i+1));
				
				Alumno alumno = new Alumno(nombre,apellidos,edad,dni);
				alumnosInsertar[i] = alumno;
			}
		}
		
	}
	
	
	private void mostrarAlumnos(Alumno[] alumnos) {
		
		if (alumnos==null) {
			System.out.println("Debes crear la universidad en la opci�n 1");
		}else {
			for (Alumno alumno : alumnos) {
				if(alumno!=null) {
					System.out.println("Nombre "+ alumno.getNombre());
					System.out.println("Apellidos "+ alumno.getApellidos());
					System.out.println("dni "+ alumno.getDni());
					System.out.println("edad "+ alumno.getEdad());
					System.out.println("=======================================");
				}else {
					System.out.println("Sin alumno");
				}
				
			}
			
		}
		
		
	}
	
	private void buscarAlumno(Alumno[] alumnos) {
		if (alumnos==null) {
			System.out.println("Debes crear la universidad en la opci�n 1");
		}else {
			
			String dniBusqueda = Utilidades.pideDatoString("Introduce el dni del alumno a buscar ");
			
			for (Alumno alumno : alumnos) {
				if(alumno !=null && alumno.getDni().equals(dniBusqueda)    ) {
					System.out.println("Alumno con dni "+dniBusqueda + " encontrado");
					break;
				}
			}
			
		}
		
	}
	
	
	private void borrarAlumno(Alumno[] alumnos) {
		
		if (alumnos==null) {
			System.out.println("Debes crear la universidad en la opci�n 1");
		}else {
			
			String dniBorrar = Utilidades.pideDatoString("Introduce el dni del alumno a buscar ");
			
			int i=0;
			boolean alumnoEncontrado = false;
			for (Alumno alumno : alumnos) {
				if(alumno !=null && alumno.getDni().equals(dniBorrar)    ) {
					System.out.println("El alumno encontrado, se elimina");
					alumnoEncontrado = true;
					alumnos[i] = null;
					break;
				}
				i++;
			}
			
			if (!alumnoEncontrado) {
				System.out.println("El alumno con dni " + dniBorrar + " no est� en la Universidad");
				
			}
			
		}
	}
}
