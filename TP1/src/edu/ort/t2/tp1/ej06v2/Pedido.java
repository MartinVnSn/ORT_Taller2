package edu.ort.t2.tp1.ej06v2;

public class Pedido {
	
	private int numCompra;
	private int fechaCompra;
	private String autorLibro;
	private String tituloLibro;
	private String editorialLibro;
	private String nomCliente;
	private String dniCliente;
	private String emailCliente;
	private String dirCliente;
	
	public Pedido(Tienda tienda, int fechaComp, Libro libro, Cliente cliente){
		super();
		this.numCompra = tienda.sizeNumCompras() + 1;
		this.fechaCompra = fechaComp;
		this.autorLibro = libro.getAutor();
		this.tituloLibro = libro.getTitulo();
		this.editorialLibro = libro.getEditorial();
		this.nomCliente = cliente.getNombre();
		this.dniCliente = cliente.getDni();
		this.emailCliente = cliente.getEmail();
		this.dirCliente = cliente.getDireccion();
		
	}
	
	public String getTituloLibro(){
		return this.tituloLibro;
	}
	
	@Override
	
	public String toString(){
		return "Número de Compra: " + this.numCompra + ", Fecha de compra: " + this.fechaCompra
				+ ", Título Libro: " + this.tituloLibro + ", Autor: " + this.autorLibro
				+ ", Editorial: " + this.editorialLibro + ", Cliente: " + this.nomCliente
				+ ", DNI: " + this.dniCliente + ", email: " + this.emailCliente
				+ ", Domicilio: " + this.dirCliente;
	}
	
}
