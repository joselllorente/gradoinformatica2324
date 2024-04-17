package edu.ucjc.poo.ejercicios.herencia.vehiculos;

public class Moto extends VehiculosMotorizados {

	private int cilindrada;
	
	public Moto(String marca, String modelo, int anioFabricacion, String matricula) {
		super(marca, modelo, anioFabricacion, matricula);
		// TODO Auto-generated constructor stub
	}

	public Moto(String marca, String modelo, int anioFabricacion, 
			String matricula, int cilindrada) {
		super(marca, modelo, anioFabricacion, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public void hacerCaballito() {
		System.out.println("La moto con matricula "+getMatricula());
	}
	
	@Override
	public void acelerar() {
		System.out.println("La moto "+this.getMatricula() + " esta acelerando");
		
	}

	@Override
	public void frenar() {
		System.out.println("La moto "+this.getMatricula() + " esta acelerando");
		
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", matricula()=" 
				+ getMatricula() + ", año de fabricacion: "
				+ getAnioFabricacion() + "]";
	}

	
}
