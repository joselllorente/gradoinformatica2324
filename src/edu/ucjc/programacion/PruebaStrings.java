package edu.ucjc.programacion;

public class PruebaStrings {

	public static void main(String[] args) {
		
		String nombre = "Texto";
		
		//nombre = nombre.toUpperCase();
		
		//System.out.println(nombre);
		
		String nombre2 = new String("Texto");
		String nombre3 = "texto";
		System.out.println(nombre==nombre2);
		System.out.println(nombre==nombre3);
		System.out.println(nombre.equals(nombre2));
		
		System.out.println(nombre.equalsIgnoreCase(nombre3));
		
		System.out.println(nombre.contains("Te"));
		
		String cadena = "    Esto es unae prueba      ";
		System.out.println(cadena.indexOf("e"));
		System.out.println(cadena.lastIndexOf("e"));
		
		System.out.println(cadena);
		System.out.println(cadena.trim());
		
		System.out.println(cadena.replace(" ", ""));
		
		System.out.println(cadena.substring(3));
		System.out.println(cadena.substring(5,20));
		
		
		//c1|c2|asdasd|21312|
		System.out.println(cadena + "|" + "c2" + "|");
		System.out.println(cadena.concat(" Prueba"));
		
		String info = "dato1;dato2;dato3";
		String [] datos = info.split(";");
		System.out.println(datos[0]);
		
		
		
		

	}

}
