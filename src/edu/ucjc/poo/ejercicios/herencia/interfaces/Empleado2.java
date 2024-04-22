package edu.ucjc.poo.ejercicios.herencia.interfaces;

public class Empleado2 extends Persona implements Empleable{
	private int id;
	private int antiguedad;
	
	public Empleado2(String dni, String nombre, int id, int antiguedad) {
		super(dni, nombre);
		this.id = id;
		this.antiguedad = antiguedad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public void insert() {
		System.out.println("Insertando Empleado "+id );

	}

	@Override
	public void fichar() {
		System.out.println("Fichando Empleado "+id);
		
	}	

	

}
