package org.example;
public class Vehiculo {
	private String marca;
	private String modelo;

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + ", Modelo: " + modelo;
	}
}
