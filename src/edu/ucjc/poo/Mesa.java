package edu.ucjc.poo;

public class Mesa { 
	private String color;
	private double precio;
	
	public Mesa(String color, double precio) {
		super();
		this.color = color;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
