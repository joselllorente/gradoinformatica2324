package edu.ucjc.poo.ejercicios.ejercicio1;

//POJO:Plain Old Java Object
public class Alumno {
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private int edad;
	private String cursando;
	private int curso;
	private String [] asignaturas;
	private String email;
	private String dni;
	
	//Constructores
	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
	}

	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.email = email;
	}

	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso, 
			String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.asignaturas = asignaturas;
	}

	public Alumno(String nombre, String apellidos, String email, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.dni = dni;
	}

	public Alumno(String nombre, String apellidos, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	//Métodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCursando() {
		return cursando;
	}

	public void setCursando(String cursando) {
		this.cursando = cursando;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDni() {
		return dni;
	}

	public void mostrarInfoAlumno (){
		System.out.println("El alumno "+this.nombre + " " +
				this.apellidos + " está estudiando "
				+ this.curso + " de " + this.cursando + 
				" con las asignaturas:");
		if(asignaturas!=null) {
			for (String asignatura : this.asignaturas) {
				if (asignatura!=null) {
					System.out.println(asignatura.toUpperCase());
				}
			}
		}else {
			System.out.println("No está matriculado de ninguna asignatura");
		}
		
		
	}
	
	
	//El método no se podría invocar desde otras clases para validar un email
	void validarEmail () {
		boolean isValido = true;
		String mensaje = "";
		email = email.trim();
		System.out.println(email);
		if (email.contains(" ")) {
			isValido = false;
			mensaje += "\n\tEl email no puede tener espacios en blanco";
		}
		
		if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@") ) {
			isValido = false;
			mensaje += "\n\tEl email tiene que tener una @";
		}else {
			String dominio = email.substring( email.indexOf("@") + 1 );
			System.out.println("dominio"+dominio);
			if (!dominio.contains(".") ) {
				isValido = false;
				mensaje += "\n\tEl email tiene que tener un punto después de la @";
			}else {//Si tiene punto después de la @ paso las siguientes validaciones
				if (dominio.indexOf(".")<2) {
					isValido = false;
					mensaje += "\n\tEl email tiene que tener una distancia mayor de dos con la @";
				}
				String subdominio = dominio.substring(dominio.lastIndexOf(".")+1); 
				if (subdominio.length() < 2 || subdominio.length() > 5) {
					isValido = false;
					mensaje += "\n\tEl número de caracteres después del último punto debe estar entre 2 y 5";
				
				}	
			}
		}
		
		if(!isValido) {
			System.out.println("El email "+ email + " no es valido "+mensaje);
		}else {
			System.out.println("El email es correcto");
		}
		
	}
}
