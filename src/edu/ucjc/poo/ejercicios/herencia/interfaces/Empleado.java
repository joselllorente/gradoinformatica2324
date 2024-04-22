package edu.ucjc.poo.ejercicios.herencia.interfaces;

public class Empleado implements Insertable, Empleable {
	private int id;
	private int antiguedad;
		
	public Empleado(int id, int antiguedad) {
		//super(dni, nombre);
		this.id = id;
		this.antiguedad = antiguedad;
	}


	@Override
	public void fichar() {
		System.out.println("Fichando empleado "+id);
		
	}


	@Override
	public void insert() {
		System.out.println("Insertando empleado "+id);
		
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

	
}
