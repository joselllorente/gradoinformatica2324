package edu.ucjc.poo.ejercicios.herencia;

public class Piano extends Instrumento {

	private int numOctavas;
	private int numPedales;
	
	public Piano(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	public Piano(String nombre, String tipo, double precio, String marca, int numOctavas, int numPedales) {
		super(nombre, tipo, precio, marca);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}

	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public int getNumPedales() {
		return numPedales;
	}

	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}

	@Override
	public String toString() {
		return "Piano [numOctavas=" + numOctavas + ", numPedales=" + numPedales + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
