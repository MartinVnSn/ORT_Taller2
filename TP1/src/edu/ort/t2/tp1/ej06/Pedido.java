package edu.ort.t2.tp1.ej06;

public class Pedido {

	private int nroDeCompra;
	
	private int fechaDeCompra;
	
	private Libro libro;
	
	private Cliente cliente;
	
	public Pedido(int nro,int fecha,Libro libro,Cliente cliente) {
		this.nroDeCompra = nro;
		this.fechaDeCompra = fecha;
		this.libro = libro;
		this.cliente = cliente;
	}

	public int getNroDeCompra() {
		return nroDeCompra;
	}

	public void setNroDeCompra(int nroDeCompra) {
		this.nroDeCompra = nroDeCompra;
	}

	public int getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(int fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void imprimePedido(){
		System.out.println(nroDeCompra +" "+ fechaDeCompra);
	}
	
}
