/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZÁLEZ FRANCO Martín, MUÑOZ Santiago, RÍOS Victoria
 * ENUNCIADO
 * Reutilizando la clase Vivienda del ejercicio anterior, crear la clase Edificio que contenga un
ArrayList de Viviendas. A través del método realizarMudanza, que recibirá el piso y
departamento de origen, y el piso y departamento de destino, se deberá trasladas personas y
muebles de una vivienda a la otra. Determinar en qué casos corresponde utilizar composición
y en cuales corresponde utilizar agregación. Finalmente, el método mostrarTodo tendrá que
mostrar por pantalla el detalle completo de todas sus viviendas.
 *  
 */

package edu.ort.t2.tp1.ej05;

public class Main {

	public static void main(String[] args) {
		Edificio e1 = new Edificio();
		e1.addVivienda("Vivienda1","Monteñeses", 1234, 4, 'C');
		e1.addVivienda("Vivienda2","Monteñeses", 1234, 2, 'B');
		Persona arturo = new Persona("Arturo", "Roman", 53);
		Persona monica = new Persona("Mónica", "Gaztambide", 35);
		Mueble mesa = new Mueble("Mesa", "Madera", "Marrón");
		Mueble mesada = new Mueble("Mesada", "Mármol", "Rojo");
		Mueble perchero = new Mueble("Perchero", "Metal", "Negro");
		Mueble sillon = new Mueble("Sillón", "Cuero", "Azul");
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
