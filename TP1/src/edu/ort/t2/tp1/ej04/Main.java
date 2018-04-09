/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZÁLEZ FRANCO Martín, MUÑOZ Santiago, RÍOS Victoria
 * ENUNCIADO
 * Crear la clase Vivienda que tendrá una Dirección (compuesta por: calle, altura, piso y
departamento) y que además pueda contener personas (nombre, apellido y edad) y muebles
(nombre, material y color).
 *  
 */

package edu.ort.t2.tp1.ej04;

public class Main {

	public static void main(String[] args) {
		Vivienda v1 = new Vivienda("Vivienda1","Monteñeses", 1234, 4, 'C');
		v1.agregarPersona("Arturo", "Roman", 53);
		v1.agregarPersona("Mónica", "Gaztambide", 35);
		
		v1.agregarMueble("Mesa", "Madera", "Marrón");
		v1.agregarMueble("Mesada", "Mármol", "Rojo");
		v1.agregarMueble("Perchero", "Metal", "Negro");
		v1.agregarMueble("Sillón", "Cuero", "Azul");
		
		v1.imprimirTodo();

	}

}
