package edu.ort.t2.tp1.ej03;

public class EMail {
	String identificador;
	String dominio;
	
	public EMail (String mail) {
		String[] dir = mail.split("@");
		identificador = dir[0];
		dominio = dir[1];
	}
	
	public String getDireccion() {
		return this.identificador + "@" + this.dominio;
	}
	
	
	public String imprimir() {
		return "\t" + this.getDireccion();
	}
}
