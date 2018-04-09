package edu.ort.t2.tp1.ej06v2;

public class Cliente {
	
	private int numCliente;
	private String nombre;
	private String dni;
	private String email;
	private String direccion;
	private String telefono;
	
	
	public Cliente(Tienda tienda, String nombre, String dni, String email,
			String direccion, String tel) {
		super();
		this.numCliente = tienda.sizeClientes() + 1 ;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.telefono = tel;
	}
	
	
	
	public int getNumCliente() {
		return numCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}


	public String getEmail() {
		return email;
	}


	public String getDireccion() {
		return direccion;
	}


	public String getTelefono() {
		return telefono;
	}
	
	
	
}
