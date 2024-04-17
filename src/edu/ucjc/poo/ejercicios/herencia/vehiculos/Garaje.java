package edu.ucjc.poo.ejercicios.herencia.vehiculos;

public class Garaje {
	
	private String nombre;
	private Coche [] plazasCoches;
	private Moto [] plazasMotos;
	private Bicicleta [] plazasBicis;
	
	public Garaje(String nombre) {
		super();
		this.nombre = nombre;
		plazasCoches = new Coche[2];
		plazasMotos = new Moto[2];
		plazasBicis = new Bicicleta[2];
	}
	
	public Garaje(String nombre, int numPlazasCoche, int numPlazasMoto,
			int numPlazasBicis) {
		super();
		this.nombre = nombre;
		plazasCoches = new Coche[numPlazasCoche];
		plazasMotos = new Moto[numPlazasMoto];
		plazasBicis = new Bicicleta[numPlazasBicis];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void aparcar(Vehiculo [] vehiculos) {
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof VehiculosMotorizados) {
				VehiculosMotorizados vm = (VehiculosMotorizados)vehiculo;
				System.out.println("Aparcando vehiculo con matricula "+vm.getMatricula());
				
				if (vehiculo instanceof Coche) {
					Coche coche = (Coche)vehiculo;
					boolean hayPlazasLibres=false;
					for (int i = 0; i < plazasCoches.length; i++) {
						if (plazasCoches[i]==null) {
							plazasCoches[i]=coche;
							System.out.println("Aparcado el coche "+coche);
							hayPlazasLibres=true;
						}
					}
					if(!hayPlazasLibres) {
						System.out.println("No hay plazas libres para el coche" +coche);
					}
				}else if (vehiculo instanceof Moto) {
					Moto moto = (Moto)vehiculo;
					boolean hayPlazasLibres=false;
					if (moto instanceof SideCar &&  ((SideCar)moto).getTamanio()>100) {
						System.out.println("El sidecar no cabe en la plaza");
					}else {
						for (int i = 0; i < plazasMotos.length; i++) {
							if (plazasMotos[i]==null) {
								plazasMotos[i]=moto;
								System.out.println("Aparcada la moto "+moto);
								hayPlazasLibres=true;
							}
						}
					}
					if(!hayPlazasLibres) {
						System.out.println("No hay plazas libres para la moto" +moto);
					}
				}
				
			}else {
				Bicicleta bici = (Bicicleta)vehiculo;
				System.out.println("Aparcando bici"+bici.getMarca());
				boolean hayPlazasLibres=false;
				
				for (int i = 0; i < plazasBicis.length; i++) {
					if (plazasBicis[i]==null) {
						plazasBicis[i]=bici;
						System.out.println("Aparcada la bici "+bici.getMarca() + 
								"con "+bici.getNumMarchas() + " marchas ");
						hayPlazasLibres=true;
					}
				}
				if(!hayPlazasLibres) {
					System.out.println("No hay plazas libres para la bici" +bici.getMarca() 
							 + "con "+bici.getNumMarchas() + " marchas ");
				}
			}
		}
		
	}
	
}
