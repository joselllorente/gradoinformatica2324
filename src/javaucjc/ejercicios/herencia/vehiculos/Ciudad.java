package javaucjc.ejercicios.herencia.vehiculos;

import edu.ucjc.poo.ejercicios.herencia.vehiculos.Garaje;
import edu.ucjc.poo.ejercicios.herencia.vehiculos.UtilsCiudad;
import edu.ucjc.poo.ejercicios.herencia.vehiculos.Vehiculo;

public class Ciudad {

	private String nombre;
	
	public Ciudad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Ciudad ciudad1 = new Ciudad("Madrid");
		ciudad1.iniciaCiudad();
		
	}
	
	private void iniciaCiudad() {
		Vehiculo[] vehiculos = UtilsCiudad.generaVehiculos();

		Garaje garaje = new Garaje("Garaje1");
		garaje.aparcar(vehiculos);
	}

	
}
