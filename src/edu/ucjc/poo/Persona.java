package edu.ucjc.poo;

public class Persona { 
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	//Constructores
	public Persona(){
		
	}
	public Persona (String dni) {
		this.dni = dni;
	}
	
	//Métodos getter y setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void correr () {
		
		if (edad<18) {	
			System.out.println("Corre muy rapido");
		}else if (edad>=18 && edad < 40) {
			System.out.println("Corre rapido");
		}else {
			System.out.println("Corre lento");
		}
		
	}
	
}





