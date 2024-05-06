package edu.ucjc.colecciones;

import java.util.ArrayList;
import java.util.List;

import edu.ucjc.poo.ejercicios.composicion.Coche;


public class Listas {

	public static void main(String[] args) {
		
		ArrayList lista1 = new ArrayList();
		
		lista1.add("Test");
		lista1.add(2);
		
//		lista1.add(coche1);
//		
//		for (Object object : lista1) {
//			if (object instanceof Coche) {
//				Coche c1 = (Coche)object;
//				System.out.println(c1.getMatricula());
//			}else {
//				System.out.println(object);
//			}
//		}
		
		Coche coche1 = new Coche("1111ABC","A",null,null);
		Coche coche2 = new Coche("2222DEF","F",null,null);
		List<Coche> coches = new ArrayList<Coche>();
		coches.add(coche1);
		coches.add(coche1);

		
		coche1.setMatricula("1010ABC");
		Coche coche3 = new Coche("3333DEF","F",null,null);
		coches.add(0,coche3);
		//coches.remove(1);
		//coches.remove(coche1);
		
		for (Coche coche : coches) {
			System.out.println(coche.getMatricula());
		}
		
		System.out.println(coches.size());
		
		
	}

}




