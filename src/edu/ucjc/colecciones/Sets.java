package edu.ucjc.colecciones;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<String> colores = new HashSet();
		
		colores.add("Blanco");
		colores.add("Blanco");
		
		for (String color : colores) {
			System.out.println(color);
		}

		
		
	}

}
