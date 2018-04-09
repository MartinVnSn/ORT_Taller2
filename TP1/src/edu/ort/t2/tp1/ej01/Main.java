/*Grupo 1
 * Integrantes: AMBROSIO Gabriel, GONZ�LEZ FRANCO Mart�n, MU�OZ Santiago, R�OS Victoria
 * ENUNCIADO
 * Crear la clase NumeroTelefonico. La misma tiene los atributos num�ricos caracter�stica,
numeroDeAbonado, el c�digo num�rico del pa�s y adem�s un atributo de tipo String que me
indicar� el tipo de l�nea (celular, fija, fax, etc.). Generar constructor por defecto,
constructor parametrizado, setters y getters. El m�todo getNumero() deber� devolver un
String en formato �(+PPP) CCCC-AAAA�, donde +PPP es un signo m�s (+) seguido por el c�digo
del pa�s.
Crear la clase EMail cuyo constructor deber� recibir un �nico String con el formato
�identificador@dominio.del.mail�. Para llenar los atributos identificador y dominio, ambos
de tipo String, se deber� usar el m�todo split(separador) de la clase String, usando la arroba
(�@�) como separador. El m�todo getDireccion() devolver� el String con la �reconstrucci�n�
de la direcci�n, utilizando ambos atributos.
Por �ltimo, crear la clase Persona (Apellido y Nombre) que pueda contener de 0 a N tel�fonos
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
