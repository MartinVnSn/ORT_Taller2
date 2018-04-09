/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZÁLEZ FRANCO Martín, MUÑOZ Santiago, RÍOS Victoria
 * ENUNCIADO
 * Una tienda de libros recibe pedidos de sus clientes a través de un formulario en su página
WEB. Cada pedido cuenta con los siguientes datos:
· Nro. de compra
· Fecha de compra
· Libro
· Cliente
Datos del libro:
· Autor
· Título del libro
· Editorial
Datos del cliente:
· Nombre y apellido
· DNI
· email
· Dirección de envío
Una vez por día la tienda debe procesar los pedidos pendientes, para ello recorre los pedidos
realizados verificando en su stock si cuenta con ejemplares del libro solicitado.
Si hay stock se elimina el pedido del listado de pendientes y se agrega el pedido a un listado
de pedidos completos.
Si no hay stock el pedido queda en el listado de pedidos pendientes.
Realizar el diagrama UML de las clases que considere necesarias.
Desarrollo del método procesarPedidos que r ealiza el comportamiento descrito para procesar
los pedidos.
 *  
 */

package edu.ort.t2.tp1.ej06;

public class Main {

	public static void main(String[] args) {
		
		Tienda miTienda = new Tienda();
		
		Libro miLibro = new Libro("Anne Frank","Diary","DEBOLSILLO");
		
		miTienda.getStock().agregaLibros(miLibro);
		
		Cliente miCliente = new Cliente("G","A",34345435,"gabe6614@gmail.com",4556);
		
		Pedido miPedido = new Pedido(1,23032018,miLibro,miCliente);
		
        miTienda.realizarPedido(miPedido);
        
        miTienda.listadoDePendientes(miPedido);
        
        miTienda.imprimePedidosComp();

	}

}
