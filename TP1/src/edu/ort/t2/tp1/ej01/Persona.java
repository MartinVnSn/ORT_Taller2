package edu.ort.t2.tp1.ej01;

import java.util.ArrayList;

public class Persona {
	String apellido;
	String nombre;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<EMail> emails;
	
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		numeros = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<EMail>();
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
	
}
