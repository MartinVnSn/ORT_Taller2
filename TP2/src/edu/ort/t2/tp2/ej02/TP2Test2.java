/*Grupo 8
 * Integrantes: AMBROSIO Gabriel, GONZ�LEZ FRANCO Mart�n, MU�OZ Santiago, R�OS Victoria
 *   
 */

package edu.ort.t2.tp2.ej02;

public class TP2Test2 {

	public static void main(String[] args) {
		
		Vendedor pedro = new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor maria = new Vendedor("Mar�a", 30, 100, 200, 10);
		
		System.out.println("Vendedor 1 " + pedro.getNombre() + " gana: " + pedro.calcularPago());
		System.out.println("Vendedor 2 " + maria.getNombre() + " gana: " + maria.calcularPago());
	}

}
