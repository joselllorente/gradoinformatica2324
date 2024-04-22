package edu.ucjc.poo.ejercicios.herencia.interfaces;

import edu.ucjc.poo.ejercicios.herencia.vehiculos.Coche;
import edu.ucjc.poo.ejercicios.herencia.vehiculos.VehiculosMotorizados;

public class ClaseMain {

	public static void main(String[] args) {
		
		
		VehiculosMotorizados coche1 = new Coche("marca1","modelo",2018,"1234-HJD",5,"Gasolina");

		Interfaz1 coche2 = new PruebaInterfaz("",0);
		
	}

}
