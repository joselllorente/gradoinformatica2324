package edu.ucjc.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarreraF1 {

	public static void main(String[] args) {
		
		
		CocheF1 coche1 = new CocheF1(1,"Piloto1","Escuderia1",300);
		
		List<String> patrocinadores2 = new ArrayList<String>();
		patrocinadores2.add("Marca1");
		patrocinadores2.add("Red Bull");
		CocheF1 coche2 = new CocheF1(2,"Piloto2","Escuderia2", patrocinadores2,400);
		
		
		List<String> patrocinadores3 = Arrays.asList("Red Bull","Marca2");
		CocheF1 coche3 = new CocheF1(3,"Piloto3","Escuderia3",patrocinadores3, 230);
		//coche3.getPatrocinadores().add("Marca4");

		CarreraF1 cf1 = new CarreraF1();
		
		List<CocheF1> coches = Arrays.asList(coche2,coche3,coche1);
//		cf1.muestraInfoCoches(coches);
//		cf1.correrCoches(coches);
		
		Map <String,List<CocheF1>> cochesPatrocinador = new  HashMap();
		cochesPatrocinador.put("Red Bull",Arrays.asList(coche3,coche2));
		cochesPatrocinador.put("Otros",Arrays.asList(coche1));
		
		cf1.mediaPorPatrocinador(cochesPatrocinador,"Otros");
		
	}
	
	private void muestraInfoCoches(List<CocheF1> coches) {
		for (CocheF1 cocheF1 : coches) {
			System.out.println(cocheF1);
		}
	}
	
	private void correrCoches(List<CocheF1> coches) {
		for (CocheF1 cocheF1 : coches) {
			cocheF1.correr();
		}
	}
	
	private void mediaPorPatrocinador(Map <String,List<CocheF1>> cochesPatrocinador) {
		mediaPorPatrocinador(cochesPatrocinador,"Red Bull");
	}
	
	private void mediaPorPatrocinador(Map <String,List<CocheF1>> cochesPatrocinador, String patrocinador) {
		
		List<CocheF1> coches = cochesPatrocinador.get(patrocinador);
		double sumaVelocidades=0;
		for (CocheF1 cocheF1 : coches) {
			sumaVelocidades += cocheF1.getVelMaxima();
		}
		
		System.out.println("La velocidad media de todos los coches de "
				+patrocinador + " es " + (sumaVelocidades/coches.size()));
	}
	

}