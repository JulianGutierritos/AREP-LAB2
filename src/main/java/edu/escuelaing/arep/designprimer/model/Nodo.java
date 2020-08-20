package edu.escuelaing.arep.designprimer.model;

/**
 * Un nodo que representa una posición en una lista. Conoce su vecino imediatmente anterior y su vecino inmediatmente siguiente.
 * @author Julian Gutierrez
 * @version 1.0
 */
public class Nodo {
	private double valor;
	private Nodo siguiente;
	private Nodo anterior;
	/**
	 * Constructor de un nodo 
	 * @param valor : Valor del nodo
	 */
	public Nodo(double valor){
		this.valor = valor;
	}
	/**
	 * Constructor de un nodo 
	 * @param valor : Valor del nodo
	 * @param siguiente : Nodo vecino siguiente 
	 * @param anterior : Nodo anterior vecino
	 */
	public Nodo(double valor, Nodo siguiente, Nodo anterior){
		this.valor = valor;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	/**
	 * Retorna el valor del nodo
	 * @return double con el valor del nodo
	 */
	public double getValor(){
		return this.valor;
	}
	/**
	 * Retorna el nodo vecino siguiente
	 * @return Nodo vecino siguiente en la lista
	 */
	public Nodo getSiguiente(){
		return this.siguiente;
	}
	/**
	 * Retorna el nodo vecino anterior
	 * @return Nodo vecino anterior en la lista
	 */
	public Nodo getAnterior(){
		return this.anterior;
	}
	/**
	 * Cambia el valor del nodo
	 * @param valor : con el nuevo valor del nodo
	 */
	public void setValor(double valor){
		this.valor = valor;
	}
	/**
	 * Cambia el vecino siguiente del nodo 
	 * @param siguiente : con el nuevo nodo vecino siguiente
	 */
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
	/**
	 * Cambia el vecino anterior del nodo 
	 * @param anterior : con el nuevo nodo vecino anterior
	 */
	public void setAnterior(Nodo anterior){
		this.anterior = anterior;
	}
}