package edu.ucjc.poo;

public class PruebaPersona {

	public static void main(String[] args) {
		
		//Creamos objeto de tipo Persona
		Persona persona1 = new Persona();
		System.out.println(persona1.getNombre());
		Persona persona2 = new Persona("111A");

		persona1.setNombre("Juan");
		persona1.setApellidos("Perez");
		persona1.setDni("2222B");
		
		System.out.println(persona1.getNombre());
		System.out.println(persona2.getEdad());
		
		Persona persona3= persona2;
		System.out.println(persona3.getEdad());
		
		persona2.setEdad(23);
		System.out.println(persona3.getEdad());
	}

}





