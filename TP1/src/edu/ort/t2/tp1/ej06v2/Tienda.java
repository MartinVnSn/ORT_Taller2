package edu.ort.t2.tp1.ej06v2;

import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Libro> stockLibros;
	private ArrayList<Pedido> pedidosPendientes;
	private ArrayList<Pedido> pedidosCompletos;
	private int numCompras;
	
	public Tienda(){
		super();
		this.clientes = new ArrayList<Cliente>();
		this.stockLibros = new ArrayList<Libro>();
		this.pedidosPendientes = new ArrayList<Pedido>();
		this.pedidosCompletos = new ArrayList<Pedido>();
		this.numCompras = 0;
	}
	
	public int sizeClientes(){
		return clientes.size();
	}
	
	public int sizeNumCompras(){
		return this.numCompras;
	}
	
	/*
	public int sizePedidosPendientes(){
		return clientes.size();
	}
	*/
	private void sumarNumCompras(){
		this.numCompras++;
	}
	
	public void addCliente(Cliente c){
		this.clientes.add(c);
	}
	
	public void addLibro(Libro libro){
		this.stockLibros.add(libro);
	}
	
	public void addPedidoPend(Pedido pedido){
		this.pedidosPendientes.add(pedido);
		sumarNumCompras();
	}
	
	public void addStockLibro(Libro libro, int cant){
		int i = 0;
		do{
			if(libro.equals(stockLibros.get(i))){
				stockLibros.get(i).agregarStock(cant);
			}
			i++;
		} while(!libro.equals(stockLibros.get(i-1)));
	}
	
	public void procesarPedidos(){
		
		Iterator<Pedido> i = pedidosPendientes.iterator();
		
		while(i.hasNext()){
			Pedido pedido = i.next();
			int stock = 0;
			int j = 0;
			boolean encontrado = false;
			Libro libro;//Revisar bien!
			do{
				libro = stockLibros.get(j);//Podría ser pesado hacer get de todo un objeto
				if(pedido.getTituloLibro().equals(libro.getTitulo())){
					stock = libro.getStock();
					encontrado = true;
				}
				j++;
			} while(!encontrado);
			
			if(stock > 0){
				pedidosCompletos.add(pedido);
				libro.restarStock();//revisar que eso funcione!!!
				i.remove();
			}
		}
		
		/*
		for(Pedido pedido : pedidosPendientes){
			int stock = 0;
			int j = 0;
			boolean encontrado = false;
			
			do{
				Libro libro = stockLibros.get(j);//Podría ser pesado hacer get de todo un objeto
				if(pedido.getTituloLibro().equals(libro.getTitulo())){
					stock = libro.getStock();
					encontrado = true;
				}
				j++;
			} while(!encontrado);
			
			if(stock > 0){
				pedidosCompletos.add(pedido);
			}
			
		}
		*/
	}
	
	public int sizePedidosPendientes(){
		return pedidosPendientes.size();
	}
	
	public int sizePedidosCompletos(){
		return pedidosCompletos.size();
	}
	
	public void printPedidosPendientes(){
		System.out.println(this.pedidosPendientes);
	}
	
	public void printPedidosCompletos(){
		System.out.println(this.pedidosCompletos);
	}
	
	public int getStockLibro(Libro libro){
		int stock = 0;
		int i = 0;
		do{
			if(libro.equals(stockLibros.get(i))){
				stock = stockLibros.get(i).getStock();
			}
			i++;
		} while(!libro.equals(stockLibros.get(i-1)));
		
		return stock; 
	}
	
}
