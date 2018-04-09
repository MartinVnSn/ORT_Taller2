package edu.ort.t2.tp1.ej04;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private char dpto;
	
	public Direccion(String calle, int alt, int piso, char dpto){
		this.calle = calle;
		altura = alt;
		this.piso = piso;
		this.dpto = dpto;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getDpto() {
		return dpto;
	}

	public void setDpto(char dpto) {
		this.dpto = dpto;
	}
	
	public String imprimir(){
		return "Dirección: " + this.calle + " " + this.altura + " " + this.piso + "°" + "\"" + this.dpto + "\"";
	}
	
}
