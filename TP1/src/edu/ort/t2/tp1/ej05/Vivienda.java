package edu.ort.t2.tp1.ej05;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
	private String nombre;
	private Direccion direccion;
	private List<Persona> personas;
	private List<Mueble> muebles;
	
	public Vivienda(String nom, String calle, int alt, int piso, char dpto){
		nombre = nom;
		direccion = new Direccion(calle, alt, piso, dpto);
		personas = new ArrayList<Persona>();
		muebles = new ArrayList<Mueble>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Direccion getDireccion(){
		return this.direccion;
	}
	
	public void agregarPersona(Persona pers){
		personas.add(pers);
	}
	
	public void agregarMueble(Mueble mueble){
		muebles.add(mueble);
	}
	
	public void removeMueble(int i) {
		muebles.remove(i);
	}
	
	public void removePersona(int i) {
		personas.remove(i);
	}
	
	public Mueble getMueble(int i) {
		return muebles.get(i);
	}
	
	public Persona getPersona(int i) {
		return personas.get(i);
	}
	
	public boolean isMueblesEmpty() {
		return muebles.isEmpty();
	}
	
	public boolean isPersonasEmpty() {
		return personas.isEmpty();
	}
	
	public void imprimirTodo(){
		System.out.println(this.nombre + ":\n" + this.direccion.imprimir() + "\nPersonas:");
		for(int i = 0; i < personas.size(); i++){
			System.out.println(personas.get(i).imprimir());
		}
		System.out.println("Muebles:");
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
