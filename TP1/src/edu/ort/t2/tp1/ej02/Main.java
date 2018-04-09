/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZ�LEZ FRANCO Mart�n, MU�OZ Santiago, R�OS Victoria
 * ENUNCIADO
 * Reutilizando las clases del ejercicio anterior, reescribirlas para que la Persona pueda tener
de 0 a N Mascotas, que contenga nombre y qu� animal es, ambos de tipo String. Debe tener
los m�todos necesarios para agregar nuevos datos o eliminar cada uno de los existentes
(menos los datos de la persona). Determinar si corresponde utilizar composici�n y agregaci�n.
 *  
 */

package edu.ort.t2.tp1.ej02;

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
