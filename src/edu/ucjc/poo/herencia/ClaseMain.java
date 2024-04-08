package edu.ucjc.poo.herencia;

public class ClaseMain {

	public static void main(String[] args) {
		ClaseHija1 claseHija = new ClaseHija1("Nombre",100,"dni");

		claseHija.metodo1(7);
		
		claseHija.metodo3("7");
		
		System.out.println(claseHija);
		
	}

}
