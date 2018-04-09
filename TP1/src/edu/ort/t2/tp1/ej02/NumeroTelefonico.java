package edu.ort.t2.tp1.ej02;

public class NumeroTelefonico {
	int caracteristica;
	int numeroDeAbonado;
	int codPais;
	String tipoLinea;
	
	public NumeroTelefonico() {
		this.caracteristica = 0;
		this.numeroDeAbonado = 0;
		this.codPais = 0;
		this.tipoLinea = null;
	}
	
	public NumeroTelefonico(int car, int numAb, int codP, String tipoLinea) {
		caracteristica = car;
		numeroDeAbonado = numAb;
		codPais = codP;
		this.tipoLinea = tipoLinea;
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	public int getCodPais() {
		return codPais;
	}

	public void setCodPais(int codPais) {
		this.codPais = codPais;
	}

	public String getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(String tipoLinea) {
		this.tipoLinea = tipoLinea;
	}
	
	public String getNumero() {
		return "(+" + this.codPais + ") " + this.caracteristica + "-" + this.numeroDeAbonado;
	}
	
	public String imprimir() {
		return "\t" + this.tipoLinea + ": " + this.getNumero();
	}
	
}
