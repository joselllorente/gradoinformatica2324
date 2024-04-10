package edu.ucjc.poo.ejercicios.herencia;

public class BandaMusica {

	private String nombre;
	
	public BandaMusica(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		
		Guitarra guitarra = new Guitarra("Guitarra","Española",300,"Yamaha",5,"Madera");
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra","Española",300,"Yamaha",5,"Madera",100);
		Instrumento bateria = new Bateria("Bateria","Tipo1",500.0,"Marca1",2,3);
		Piano piano = new Piano("Piano","Cola",1000, "Marca1", 5, 3);
		
		Instrumento guitarra2 = new Guitarra("Guitarra2","Española",300,"Yamaha",5,"Madera");
		guitarra2.tocar();
//		guitarra2.afinar();
		//Guitarra guitarra3 = new Instrumento("","",6,"");
		
		Instrumento [] instrumentos = {guitarra,bateria,piano,guitarraElectrica};
		
		BandaMusica banda = new BandaMusica("Nombre Banda");
		banda.iniciarConcierto(instrumentos);
		
		//bateria.aporrear();
		//((Bateria)bateria).aporrear();
		
	}
	
	private void iniciarConcierto(Instrumento [] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		System.out.println();
		
		for (Instrumento instrumento : instrumentos) {
			instrumento.tocar();
			if (instrumento instanceof Bateria) {
				((Bateria)instrumento).aporrear();
			}
		}
	}

}
