package com.snwehre.exemplos.serializacao;

import java.io.Serializable;
import java.util.Calendar;

public class Tenis implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int tamanho;
	private String modelo;
	private String marca;
	private Calendar compra; 
	
	/**
	 * Objeto n�o � serializ�vel, a palavra reservada {@link transient}, informa
	 * para a JVM que este atributo n�o � serializ�vel, importante usar em
	 * objetos que n�o necessitam de ser serializados, como por exemplo este
	 * atributo que � calculado a partir de outro, j� serializado.
	 */
	private transient Integer desgaste;
	
	public Tenis(int tamanho, String modelo, String marca) {
		super();
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.marca = marca;
		this.compra = Calendar.getInstance();
	}
	
	public String toString(){
		System.out.println(desgaste);
        return this.marca + " " + this.modelo +
        		" - Tamanho: " + String.valueOf(this.tamanho)+
        		" - "+this.compra;
    }
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
}