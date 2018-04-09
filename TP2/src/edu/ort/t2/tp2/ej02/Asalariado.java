package edu.ort.t2.tp2.ej02;

public class Asalariado extends Empleado {
	private float sueldo;
	
	public Asalariado(){
		//no se necesita el super() porque el compilador va a invocar al constructor
		//sin parámetros de forma automática
	}

	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	
	
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public float calcularPago(){
		return this.sueldo;
	}

	@Override
	public String toString(){
		return "[Nombre: " + this.getNombre() + ", Edad: " + this.getEdad()
		+ ", Sueldo: " + this.sueldo + "]";
	}
	
	
}
