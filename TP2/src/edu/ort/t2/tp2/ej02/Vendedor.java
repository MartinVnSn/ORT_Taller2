package edu.ort.t2.tp2.ej02;

public class Vendedor extends SubContratado {
	private float porcentaje;
	
	public Vendedor(){
		//super();
	}
	
	public Vendedor(String nombre, int edad, float horas, float precioHora, float porcentaje){
		super(nombre, edad, horas, precioHora);
		this.porcentaje = porcentaje;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	@Override
	public float calcularPago(){
		return (this.getCantHoras()*this.getPrecioHora())*(1+(this.porcentaje/100));
	}

	@Override
	public String toString(){
		return "[Nombre: " + this.getNombre() + ", Edad: " + this.getEdad()
		+ ", Sueldo: " + this.calcularPago() + "]";
	}
	
}
