package edu.ort.t2.tp1.ej06v2;

public class Libro {
	private String titulo;
	private String autor;
	private String editorial;
	private int stock;
	
	public Libro(String titulo, String autor, String editorial){
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.stock = 0;
	}
	
	public void restarStock(){
		this.stock--;
	}
	
	public void agregarStock(int cant){
		this.stock += cant;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getStock() {
		return stock;
	}
	
	
}
