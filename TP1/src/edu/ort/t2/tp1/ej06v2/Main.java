package edu.ort.t2.tp1.ej06v2;

public class Main {

	public static void main(String[] args) {

		Tienda t = new Tienda();
		
		Libro libro1 =  new Libro("Cabeza", "Alberto", "Eusebio");
		Libro libro2 =  new Libro("Lagarto", "Chares", "Android");
		Libro libro3 =  new Libro("Pera", "Laiseca", "Lackey");
		
		Cliente c1 = new Cliente(t, "JuanP", "32208388", "pepito@gmail.com", "Libertador 33", "47423333");
		Cliente c2 = new Cliente(t, "JaviF", "23358742", "pepato@gmail.com", "Libertador 5", "47883366");
		t.addCliente(c1);
		
		t.addLibro(libro1);
		t.addLibro(libro2);
		t.addLibro(libro3);
		
		t.addStockLibro(libro1, 4);
		t.addStockLibro(libro2, 2);//Stock 0 del libro 3
		
		Pedido p1 = new Pedido(t, 11031986, libro1, c1);
		
		t.addPedidoPend(p1);
		
		Pedido p2 = new Pedido(t, 11031985, libro2, c2);
		
		t.addPedidoPend(p2);
		
		Pedido p3 = new Pedido(t, 11031985, libro3, c1);
		
		t.addPedidoPend(p3);
		
		t.procesarPedidos();
		
		System.out.println("Pedidos pendientes: " + t.sizePedidosPendientes());
		t.printPedidosPendientes();
		
		System.out.println("Pedidos completos: " + t.sizePedidosCompletos());
		t.printPedidosCompletos();
		
		System.out.println("Stock libro1: " + t.getStockLibro(libro1));
		System.out.println("Stock libro2: " + t.getStockLibro(libro2));
		System.out.println("Stock libro3: " + t.getStockLibro(libro3));

	}

}
