package edu.ucjc.poo.herencia.abstractas;

public abstract class Clase1 {
	private String nombre1;

	public Clase1(String nombre1) {
		super();
		this.nombre1 = nombre1;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	@Override
	public String toString() {
		return "Clase1 [nombre1=" + nombre1 + "]";
	}
	
	//Metodo abstracto, método sin implementación
	//Obliga a que la clase sea abstracta
	public abstract void metodo1();
	
	public abstract void metodo2();
	
}
