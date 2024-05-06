package edu.ucjc.colecciones;

import java.util.HashMap;
import java.util.Map;

import edu.ucjc.poo.ejercicios.composicion.Coche;



public class Mapas {

	public static void main(String[] args) {
		Map<String,Coche> coches = new HashMap();
		Coche coche1 = new Coche("1111ABC","A",null,null);
		Coche coche2 = new Coche("2222DEF","F",null,null);
		Coche coche3 = new Coche("3333ABC","A",null,null);
		Coche coche4 = new Coche("4444DEF","F",null,null);

		coches.put(coche1.getMatricula(), coche1);
		coches.put(coche2.getMatricula(), coche2);
		coches.put(coche3.getMatricula(), coche3);
		coches.put(coche4.getMatricula(), coche4);
		
		coches.get("2222DEF");
		
	}

}
