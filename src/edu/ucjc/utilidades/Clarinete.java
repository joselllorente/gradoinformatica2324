package edu.ucjc.utilidades;

import edu.ucjc.poo.ejercicios.herencia.Instrumento;

public class Clarinete extends Instrumento {

	public Clarinete(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void tocar () {
		System.out.println("Tocando el clarinete");
	}
	
}
