/*Grupo 8
 * Integrantes: AMBROSIO Gabriel, GONZ�LEZ FRANCO Mart�n, MU�OZ Santiago, R�OS Victoria
 *   
 */

package edu.ort.t2.tp2.ej01;

public class TP2Test1 {

	public static void main(String[] args) {
		Asalariado jose = new Asalariado("Jos�", 30, 10000);
		SubContratado carlos = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println("Asalariado " + jose.getNombre() + " gana: " + jose.calcularPago());
		System.out.println("SubContratado " + carlos.getNombre() + " gana: " + carlos.calcularPago());
	}

}
