package edu.ort.t2.tp1.ej02;

public class Mascota {
	private String nombre;
	private String animal;
	
	public Mascota(String nombre, String animal) {
		super();
		this.nombre = nombre;
		this.animal = animal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAnimal() {
		return animal;
	}
	
	public String imprimir() {
		return "\t" + this.animal + ", " + this.nombre;
	}
	
}
