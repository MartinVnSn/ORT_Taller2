package edu.ort.t2.tp1.ej03;

import java.util.ArrayList;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> persInvolucradas;
	
	public Hito(String fecha, String descripcion, ArrayList<Persona> persInvolucradas) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.persInvolucradas = persInvolucradas;
	}
		
	public void mostrarHito(){
		System.out.println("Fecha: " + this.fecha + "\nDescripción: " + this.descripcion + "\nPersonas involucradas:");
		for(int i = 0; i < persInvolucradas.size(); i++){
			System.out.println(persInvolucradas.get(i).getPersona());
		}
	}
	
}
