package com.dominosoft.targetadigital.model;

public class Tarjeta {
	private String nombreEntidad;
	private String numeroTarjeta;
	private String fechaCaducidad;
	private String nombreTitular;
	private String cvv;
	private MarcaEnum marca;

	public Tarjeta() {
	}

	public Tarjeta(String nombreEntidad, String numeroTarjeta, String fechaCaducidad, String nombreTitular, String cvv,
			MarcaEnum marca) {
		this.nombreEntidad = nombreEntidad;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaCaducidad = fechaCaducidad;
		this.nombreTitular = nombreTitular;
		this.cvv = cvv;
		this.marca = marca;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public MarcaEnum getMarca() {
		return marca;
	}

	public void setMarca(MarcaEnum marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tarjeta [nombreEntidad=" + nombreEntidad + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad="
				+ fechaCaducidad + ", nombreTitular=" + nombreTitular + ", cvv=" + cvv + ", marca=" + marca + "]";
	}

}
