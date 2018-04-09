package edu.ort.t2.tp1.ej06;

import java.util.*;

public class Tienda {

	private ArrayList<Pedido> pedidosRealizados = new ArrayList<>();
	
	private ArrayList<Pedido> pedidosCompletos = new ArrayList<>();

	private Stock stock;
	
	
	public Tienda() {
		
		this.stock = new Stock();
		
	}

    public void listadoDePendientes(Pedido p){
    	
    	ArrayList<Libro> traeListaStock = new ArrayList<>();
    		
    	for(int i=0;i<pedidosRealizados.size();i++) {
    			traeListaStock = stock.getLibros();
    			for(int b=0;b<traeListaStock.size();b++) {
    				if(pedidosRealizados.get(i).getLibro().equals(p.getLibro())) {
    					pedidosCompletos.add(pedidosRealizados.get(i));
    				}else{
    					System.out.println("No hay pendientes");
    				}
    			}
    			
    		}   
   
    }
    	
    
    	public void realizarPedido(Pedido e) {
    		
    		pedidosRealizados.add(e);
    		
    	}
    	
    	public Stock getStock() {
    		return stock;
    	}
   
    	
    	public void imprimePedidosComp(){
    		
    		for(int i=0;i<pedidosCompletos.size();i++) {
    			pedidosCompletos.get(i).imprimePedido();
    			pedidosCompletos.get(i).getCliente().imprimeCliente();
    			pedidosCompletos.get(i).getLibro().imprimeLibro();
    		}
    		
    	}
    	
}    