package edu.ucjc.poo.ejercicios.herencia.interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		Persona persona = new Persona("1A","N1");
		Persona empleado = new Empleado2 ("1A","N1",1,6);
		Insertable ordenador = new Ordenador("Marca","Modelo");

		Insertable [] objetos = {persona,empleado,ordenador};
		
		TestInterfaces ti = new TestInterfaces();
		ti.insertar(objetos);
	}
	
	public void insertar (Insertable  objeto) {
		System.out.println("Insertando objeto");
		objeto.insert();
		System.out.println("Objeto insertado");
			
	}
	
	public void insertar (Insertable [] objetos) {
		
		for (Insertable objeto : objetos) {
			insertar(objeto);
//			System.out.println("Insertando objeto");
//			objeto.insert();
//			System.out.println("Objeto insertado");
		}
		
	}
	
	public void fichar(Empleable empleado) {
		empleado.fichar();
	}
	

}
