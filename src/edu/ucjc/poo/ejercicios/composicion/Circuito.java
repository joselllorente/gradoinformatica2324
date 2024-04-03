package edu.ucjc.poo.ejercicios.composicion;

public class Circuito {

	private String nombre;
	
	public Circuito(String nombre) {
		super();
		this.nombre = nombre;
	}


	public static void main(String[] args) {
		
//		for (String dato : args) {
//			System.out.println(dato);
//		}
		//Creo el coche1
		Piston piston1 = new Piston(1,"Marca1");
		Motor motor1= new Motor("MarcaMotor1",120,piston1);
		Volante volante1 = new Volante(1,"Deportivo","negro");
		Coche coche1 = new Coche("1111-ABC","SEAT",volante1,motor1);
		
		double velocidad = Math.random()*120;
		coche1.setVelocidad(velocidad);
		
		//Creo el coche2
		Motor motor2= new Motor("MarcaMotor2",190);
		Piston piston2 = new Piston(2,"Marca2");
		motor2.setPiston(piston2);
		Volante volante2 = new Volante(2,"Deportivo","negro");
		Coche coche2 = new Coche("2222-ABC","VW",volante2,motor2);
		
		coche2.setVelocidad(Math.random()*120);
		
		Coche[] coches = {coche1, coche2};
		
		Circuito circuito = new Circuito("Circuito1");
		circuito.arrancarCoches(coches);
		for (Coche coche : coches) {
			System.out.println(coche.getMarca());
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void arrancarCoches(Coche[] coches) {
		
		
		System.out.println("Arrancando los coches del circuito "+this.nombre);
		for (Coche coche : coches) {
			System.out.println(coche.getMarca());
			coche.setMarca("BMW");
			coche.conducir();
		}
	}
	
	

}
