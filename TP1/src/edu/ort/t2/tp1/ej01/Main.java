/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZÁLEZ FRANCO Martín, MUÑOZ Santiago, RÍOS Victoria
 * ENUNCIADO
 * Crear la clase NumeroTelefonico. La misma tiene los atributos numéricos característica,
numeroDeAbonado, el código numérico del país y además un atributo de tipo String que me
indicará el tipo de línea (celular, fija, fax, etc.). Generar constructor por defecto,
constructor parametrizado, setters y getters. El método getNumero() deberá devolver un
String en formato “(+PPP) CCCC-AAAA”, donde +PPP es un signo más (+) seguido por el código
del país.
Crear la clase EMail cuyo constructor deberá recibir un único String con el formato
“identificador@dominio.del.mail”. Para llenar los atributos identificador y dominio, ambos
de tipo String, se deberá usar el método split(separador) de la clase String, usando la arroba
(”@”) como separador. El método getDireccion() devolverá el String con la “reconstrucción”
de la dirección, utilizando ambos atributos.
Por último, crear la clase Persona (Apellido y Nombre) que pueda contener de 0 a N teléfonos
y de 0 a N emails.
El metodo mostrarTodo de la clase Persona debe imprimir por pantalla el contenido completo
de la persona.
 *  
 */

package edu.ort.t2.tp1.ej01;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Messi", "Lionel");
		
		p1.addNum(new NumeroTelefonico(549, 2222, 114111, "Celular"));
		p1.addNum(new NumeroTelefonico(68, 032444, 5678, "Celular"));
		p1.addNum(new NumeroTelefonico(54, 4411, 5472, "Fijo"));
		
		p1.addMail(new EMail("lio@messi.com"));
		
		p1.mostrarTodo();

	}

}
