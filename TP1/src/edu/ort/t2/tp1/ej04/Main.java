/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZ�LEZ FRANCO Mart�n, MU�OZ Santiago, R�OS Victoria
 * ENUNCIADO
 * Crear la clase Vivienda que tendr� una Direcci�n (compuesta por: calle, altura, piso y
departamento) y que adem�s pueda contener personas (nombre, apellido y edad) y muebles
(nombre, material y color).
 *  
 */

package edu.ort.t2.tp1.ej04;

public class Main {

	public static void main(String[] args) {
		Vivienda v1 = new Vivienda("Vivienda1","Monte�eses", 1234, 4, 'C');
		v1.agregarPersona("Arturo", "Roman", 53);
		v1.agregarPersona("M�nica", "Gaztambide", 35);
		
		v1.agregarMueble("Mesa", "Madera", "Marr�n");
		v1.agregarMueble("Mesada", "M�rmol", "Rojo");
		v1.agregarMueble("Perchero", "Metal", "Negro");
		v1.agregarMueble("Sill�n", "Cuero", "Azul");
		
		v1.imprimirTodo();

	}

}
