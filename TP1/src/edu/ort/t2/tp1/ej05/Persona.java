package edu.ort.t2.tp1.ej05;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	
	public Persona(String nom, String apellido, int edad){
		nombre = nom;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String imprimir(){
		return "Nombre: " + this.nombre + " " + this.apellido + ", Edad: " + this.edad; 
	}
	
}
