/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZÁLEZ FRANCO Martín, MUÑOZ Santiago, RÍOS Victoria
 * ENUNCIADO
 * Reutilizando las clases del ejercicio anterior, agregar la clase Hito (Fecha, Descripcion,
Personas Involucradas) para poder agregar momentos importantes en la vida de la persona
(puede tener 0 a N). Un hito puede ser utilizado para más de una persona.
 *  
 */

package edu.ort.t2.tp1.ej03;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Messi", "Lionel");
		p1.addNum(new NumeroTelefonico(549, 2222, 114111, "Celular"));
		p1.addNum(new NumeroTelefonico(68, 032444, 5678, "Celular"));
		p1.addNum(new NumeroTelefonico(54, 4411, 5472, "Fijo"));
		
		p1.addMail(new EMail("lio@messi.com"));
		p1.addMail(new EMail("liomessi_newells@hotmail.com"));
		Mascota m1 = new Mascota("Pluto", "Perro");
		Mascota m2 = new Mascota("Felix", "Gato");
		Mascota m3 = new Mascota("Bugs", "Conejo");
		p1.addMascota(m1);
		p1.addMascota(m2);
		p1.addMascota(m3);
		p1.mostrarTodo();

	}

}
