package edu.ort.t2.tp1.ej06;

public class Cliente {

	private String nombre;
	
	private String apellido;
	
	private int dni;
	
	private String email;
	
	private int direEnvio;
	
	
	public Cliente(String nom,String ape,int dni,String email,int dir) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		this.email = email;
		this.direEnvio = dir;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDireEnvio() {
		return direEnvio;
	}

	public void setDireEnvio(int direEnvio) {
		this.direEnvio = direEnvio;
	}
	
	public void imprimeCliente() {
		System.out.println(nombre +" "+ apellido +" "+ dni +" "+ email +" "+ direEnvio);
	}
}
