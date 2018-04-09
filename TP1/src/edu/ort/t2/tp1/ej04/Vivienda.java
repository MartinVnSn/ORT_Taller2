package edu.ort.t2.tp1.ej04;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
	private String nombre;
	private Direccion direccion;
	private List<Persona> personas;
	private List<Mueble> muebles;
	
	public Vivienda(String nom, String calle, int alt, int piso, char dpto){
		this.nombre = nom;
		direccion = new Direccion(calle, alt, piso, dpto);
		personas = new ArrayList<Persona>();
		muebles = new ArrayList<Mueble>();
	}
	
	public void agregarPersona(String nom, String apellido, int edad){
		personas.add(new Persona(nom, apellido, edad));
	}
	
	public void agregarMueble(String nom, String material, String color){
		muebles.add(new Mueble(nom, material, color));
	}
	
	public void imprimirTodo(){
		System.out.println(this.nombre + ":\n" + this.direccion.imprimir() + "\nPersonas");
		
		for(int i = 0; i < personas.size(); i++){
			System.out.println(personas.get(i).imprimir());
		}
		System.out.println("Muebles");
		for(int i = 0; i < muebles.size(); i++){
			System.out.println(muebles.get(i).imprimir());
		}
	}
	
	/*private static <T> void imprimirArray(ArrayList<T> lista){
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i).imprimir());
		}
	}
	*/
}
