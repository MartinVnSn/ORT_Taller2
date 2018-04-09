package edu.ort.t2.tp2.ej01;

public abstract class Empleado {
	
	private String nombre;
	private int edad;
	
	public Empleado(){
		
	}
	
	public Empleado(String nombre, int edad){
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float calcularPago(){
		return 0.0f;
	}
	
	@Override
	public String toString(){
		return "[Nombre: " + this.nombre + ", Edad: " + this.edad + "]";
	}
	
}
