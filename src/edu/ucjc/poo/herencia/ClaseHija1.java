package edu.ucjc.poo.herencia;

public class ClaseHija1 extends ClasePadre{

	private String atributo2;

	public ClaseHija1(String atributo1, 
			int contador, 
			String atributo2) {
		super(atributo1, contador);
		this.atributo2 = atributo2;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	
	public void metodo2 () {
		System.out.println("Metodo 2 de la clase hija");
		
	}
	
	@Override
	public String metodo1(int num) {
		//super.metodo1();
		System.out.println("Metodo 1 de la clase hija");
		return "";
	}

	@Override
	public String toString() {
		return "ClaseHija1 [atributo2=" + atributo2 + ", getAtributo1()=" + getAtributo1() + ", getContador()="
				+ getContador() + "]";
	}


	//Sobrecarga de métodos
	public void metodo3(int numero) {
		System.out.println("metodo3" + numero);
	}
	public void metodo3(String direccion) {
		System.out.println("metodo3 "+direccion);
	}
	
}
