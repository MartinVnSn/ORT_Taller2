/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZ�LEZ FRANCO Mart�n, MU�OZ Santiago, R�OS Victoria
 * ENUNCIADO
 * Reutilizando la clase Vivienda del ejercicio anterior, crear la clase Edificio que contenga un
ArrayList de Viviendas. A trav�s del m�todo realizarMudanza, que recibir� el piso y
departamento de origen, y el piso y departamento de destino, se deber� trasladas personas y
muebles de una vivienda a la otra. Determinar en qu� casos corresponde utilizar composici�n
y en cuales corresponde utilizar agregaci�n. Finalmente, el m�todo mostrarTodo tendr� que
mostrar por pantalla el detalle completo de todas sus viviendas.
 *  
 */

package edu.ort.t2.tp1.ej05;

public class Main {

	public static void main(String[] args) {
		Edificio e1 = new Edificio();
		e1.addVivienda("Vivienda1","Monte�eses", 1234, 4, 'C');
		e1.addVivienda("Vivienda2","Monte�eses", 1234, 2, 'B');
		Persona arturo = new Persona("Arturo", "Roman", 53);
		Persona monica = new Persona("M�nica", "Gaztambide", 35);
		Mueble mesa = new Mueble("Mesa", "Madera", "Marr�n");
		Mueble mesada = new Mueble("Mesada", "M�rmol", "Rojo");
		Mueble perchero = new Mueble("Perchero", "Metal", "Negro");
		Mueble sillon = new Mueble("Sill�n", "Cuero", "Azul");
		e1.addMueble("Vivienda1", mesa);
		e1.addMueble("Vivienda1", mesada);
		e1.addMueble("Vivienda1", perchero);
		e1.addMueble("Vivienda1", sillon);
		e1.addPersona("Vivienda1", arturo);
		e1.addPersona("Vivienda1", monica);
		
		e1.imprimirTodo();
		e1.realizarMudanza(4, 'C', 2, 'B');
		e1.imprimirTodo();

	}

}
