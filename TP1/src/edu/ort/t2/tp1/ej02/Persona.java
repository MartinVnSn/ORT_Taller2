package edu.ort.t2.tp1.ej02;

import java.util.ArrayList;


public class Persona {
	String apellido;
	String nombre;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<EMail> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		numeros = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<EMail>();
		mascotas = new ArrayList<Mascota>();
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addNum(NumeroTelefonico num) {
		numeros.add(num);
	}
	
	public void addMail(EMail mail) {
		emails.add(mail);
	}
	
	public void addMascota(Mascota masc) {
		mascotas.add(masc);
	}
	
	public void removeMail(String elem) {
		int i = 0;
		boolean borrado = false;
		do{
			if(emails.get(i).getDireccion().equals(elem)) {
				emails.remove(i);
				borrado = true;
			}
			
		} while(!borrado && i < emails.size());
		resultadoBorrar(borrado, elem);
	}
	
	public void removeTel(String elem) {
		int i = 0;
		boolean borrado = false;
		do{
			if(numeros.get(i).getNumero().equals(elem)) {
				numeros.remove(i);
				borrado = true;
			}
			
		} while(!borrado && i < numeros.size());
		resultadoBorrar(borrado, elem);
	}
	
	public void removeMascota(String elem) {
		int i = 0;
		boolean borrado = false;
		do{
			if(mascotas.get(i).getNombre().equals(elem)) {
				mascotas.remove(i);
				borrado = true;
			}
			
		} while(!borrado && i < mascotas.size());
		resultadoBorrar(borrado, elem);
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);
				
		if(numeros.size() > 0) {
			if(numeros.size() > 1) {
				System.out.println("Telefonos: ");
			} else {
				System.out.println("Teléfono");
			}
			imprimirTelefonos();
			
		} else {
			System.out.println("No posee números telefónicos");
		}
		if(emails.size() > 0) {
			System.out.println("e-mail:");
			imprimirMails();
		} else {
			System.out.println("No posee direcciones de e-mail");
		}
		
		if(mascotas.size() > 0) {
			if(numeros.size() > 1) {
				System.out.println("Mascotas: ");
			} else {
				System.out.println("Mascota");
			}
			imprimirMascotas();
			
		} else {
			System.out.println("No posee mascotas");
		}
		
	}
	
	private void imprimirTelefonos(){
		for(int i=0 ; i < numeros.size(); i++) {
			System.out.println(numeros.get(i).imprimir());
		}
	}
	
	private void imprimirMails(){
		for(int i=0 ; i < emails.size(); i++) {
			System.out.println(emails.get(i).imprimir());
		}
	}
	
	private void imprimirMascotas(){
		for(int i=0 ; i < mascotas.size(); i++) {
			System.out.println(mascotas.get(i).imprimir());
		}
	}
	
	private void resultadoBorrar(boolean borrado, String elem) {
		if(!borrado) {
			System.out.println("No se encontró el elemento que desea borrar");
		} else {
			System.out.println("El elemento " + elem + " ha sido borrado" );
		}
	}
	
}
