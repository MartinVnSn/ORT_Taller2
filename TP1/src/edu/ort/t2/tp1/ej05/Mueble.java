package edu.ort.t2.tp1.ej05;

public class Mueble {
	String nombre;
	String material;
	String color;
	
	public Mueble(String nom, String material, String color){
		nombre = nom;
		this.material = material;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String imprimir(){
		return this.nombre + " de " + this.material + " color " + this.color;
	}
	
}
