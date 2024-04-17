package edu.ucjc.poo.ejercicios.herencia.vehiculos;

public final class CocheElectrico extends Coche {

	private double velocidadCarga;
	
	public CocheElectrico(String marca, String modelo, int anioFabricacion, String matricula, int numPuertas,
			String tipoCombustible, double velocidadCarga) {
		super(marca, modelo, anioFabricacion, matricula, 
				numPuertas, tipoCombustible);
		this.velocidadCarga = velocidadCarga;
	}

	public double getVelocidadCarga() {
		return velocidadCarga;
	}
	public void setVelocidadCarga(double velocidadCarga) {
		this.velocidadCarga = velocidadCarga;
	}


	public void recargar() {
		System.out.println("El coche electrico con matricula "+ getMatricula() 
		+ "estÃ¡ recargando");
	}
	
	@Override
	public void arrancar () {
		System.out.println("El coche "+this.getMatricula() + " esta arrancando pulsando el botón");
	}
}
