package edu.ucjc.poo.ejercicios.herencia.vehiculos;

public abstract class VehiculosMotorizados extends Vehiculo {

	private String matricula;

	public VehiculosMotorizados(String marca, String modelo, int anioFabricacion, 
			String matricula) {
		super(marca, modelo, anioFabricacion);
		this.matricula = matricula;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void arrancar() {
		System.out.println("El veh�culo con " + this.matricula + " está arrancando el motor con llave");
	}

	public void parar() {
		System.out.println("El veh�culo con " + this.matricula + " está parando el motor");
	}

	@Override
	public String toString() {
		return "VehiculosMotorizados [matricula=" + matricula + "]";
	}
	
	
}
