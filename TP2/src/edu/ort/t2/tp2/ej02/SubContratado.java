package edu.ort.t2.tp2.ej02;

public class SubContratado extends Empleado {
	
	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		//super();
	}
	public SubContratado(String nombre, int edad, float horas, float precioHora) {
		super(nombre, edad);
		this.cantHoras = horas;
		this.precioHora = precioHora;
	}
	public float getCantHoras() {
		return cantHoras;
	}
	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}
	public float getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
	@Override
	public float calcularPago(){
		return this.cantHoras*this.precioHora;
	}

	@Override
	public String toString(){
		return "[Nombre: " + this.getNombre() + ", Edad: " + this.getEdad()
		+ ", Sueldo: " + this.calcularPago() + "]";
	}
	
	
}
