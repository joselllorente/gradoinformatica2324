package edu.ucjc.poo.herencia;

public class ClasePadre {
	private String atributo1;
	private int contador;
	
	public ClasePadre(String atributo1, int contador) {
		super();
		this.atributo1 = atributo1;
		this.contador = contador;
	}
	
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public String metodo1 (int num) {
		System.out.println("Metodo 1 del padre");
		
		return "";
	}
}
