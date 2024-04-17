package edu.ucjc.poo.ejercicios.herencia.vehiculos;

public class Coche extends VehiculosMotorizados {

	private int numPuertas;
	private String tipoCombustible;
	
	public Coche(String marca, String modelo, int anioFabricacion, String matricula, int numPuertas,
			String tipoCombustible) {
		super(marca, modelo, anioFabricacion, matricula);
		this.numPuertas = numPuertas;
		this.tipoCombustible = tipoCombustible;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}



	@Override
	public String toString() {
		return super.toString() + "Coche [numPuertas=" + numPuertas + ", tipoCombustible=" + tipoCombustible + "]";
	}

	@Override
	public void acelerar() {
		System.out.println("El coche "+this.getMatricula() + " esta acelerando");
		
	}

	@Override
	public void frenar() {
		System.out.println("El coche "+this.getMatricula() + " esta acelerando");
		
	}
	
	

}
