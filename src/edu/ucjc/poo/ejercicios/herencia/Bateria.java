package edu.ucjc.poo.ejercicios.herencia;

public class Bateria extends Instrumento {

	private int numTimbales;
	private int numPlatos;

	public Bateria(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	public Bateria(String nombre, String tipo, double precio, String marca, int numTimbales, int numPlatos) {
		super(nombre, tipo, precio, marca);
		this.numTimbales = numTimbales;
		this.numPlatos = numPlatos;
	}

	public int getNumTimbales() {
		return numTimbales;
	}

	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}

	public int getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(int numPlatos) {
		this.numPlatos = numPlatos;
	}

	@Override
	public String toString() {
		return "Bateria [numTimbales=" + numTimbales + ", numPlatos=" + numPlatos + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void aporrear() {
		System.out.println("Aporreando la bateria "+this.getNombre());
	}

	
	
}
