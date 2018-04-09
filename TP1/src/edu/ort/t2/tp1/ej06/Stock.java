package edu.ort.t2.tp1.ej06;

import java.util.ArrayList;

public class Stock {
	
	private ArrayList<Libro> libros = new ArrayList<>();
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	
	
	public void agregaLibros(Libro e) {
		
		libros.add(e);
		
	}
	
	public void imprimeLibro() {
		for(int i=0;i<libros.size();i++) {
			System.out.println(libros.get(i));
		}
	}
	
	/*public ArrayList<Libro> devuelvoStock(){
		
		Libro miLibro = new Libro();
		ArrayList<Libro> copia = new ArrayList<>(); 	
		for(int i=0;i<libros.size();i++){
	     		miLibro = libros.get(i);
		         	copia.add(miLibro);
		                                }
         return copia;
	}*/
	
}
