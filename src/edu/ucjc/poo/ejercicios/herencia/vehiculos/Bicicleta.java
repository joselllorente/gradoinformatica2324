package edu.ucjc.poo.ejercicios.herencia.vehiculos;

public final class Bicicleta extends Vehiculo {

	private int numMarchas;
	
	public Bicicleta(String marca, String modelo, int anioFabricacion) {
		super(marca, modelo, anioFabricacion);
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(String marca, String modelo, int anioFabricacion, int numMarchas) {
		super(marca, modelo, anioFabricacion);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	@Override
	public String toString() {
		return "Bicicleta [numMarchas=" + numMarchas + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ "]";
	}

	@Override
	public void acelerar() {
		System.out.println("La bicileta está acelerando");
		
	}

	@Override
	public void frenar() {
		System.out.println("La bicileta está frenando");
		
	}

	
	
	
}
