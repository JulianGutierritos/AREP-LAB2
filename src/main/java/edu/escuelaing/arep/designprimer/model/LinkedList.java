package edu.escuelaing.arep.designprimer.model;

import edu.escuelaing.arep.designprimer.exceptions.ListaException;

/**
 * Implementación de una lista enlazada
 * @author Julian Gutierrez
 * @version 1.0
 */
public class LinkedList implements Lista{
	private Integer longitud = 0;
	private Nodo cabeza;
	private Nodo cola;

	/**
	 * Constructor de una lista enlazada
	 */
	public LinkedList(){
	}
	
	 /**
     * Retorna la primera posicion de la lista.
     * @return Nodo que es la primera posicion de la lista. 
     */
	public Nodo getCabeza(){
		return this.cabeza;
	}

	 /**
     * Retorna la ulitma posicion de la lista.
     * @return Nodo que es la ultima posicion de la lista. 
     */
	public Nodo getCola(){
		return this.cola;
	}

	/**
     * Retorna un elemento de la lista dada su pocision.
     * @param pos posicion que se desea retornar.
	 * @return Nodo si la posicion dada se encuentra en la lista o null de lo contrario. 
     */
	public Nodo get(int pos) throws ListaException{
		if ((pos < this.longitud) && (pos >= 0)){
			int i = 0;
			Nodo actual = this.cabeza;
			while (i < pos){
				actual = actual.getSiguiente();
				i++;
			}
			return actual;
		}
		else{
			throw new ListaException("La posicion ingresada no corresponde a una posicion que se encuentre en la lista.");
		}
	}

	/**
     * Agrega un valor a la ulitma posicion de la lista.
     * @param valor el cual es el valor que se quiere ingresar en la lista. 
     */
	public void add(double valor){
		Nodo n = new Nodo(valor);
		if (this.cabeza == null){
			this.cabeza = n;
			this.cola=n;
		}
		else{
			this.cola.setSiguiente(n);
			n.setAnterior(this.cola);
			this.cola=n;
		}
		this.longitud+=1;
	}

	/**
     * Agrega un valor a la lista.
	 * @param valor el valor a inglresar en la lista.
     * @param pos que es la posicion que se quiere eliminar de la lista. 
     */
	public void add(double valor, int pos) throws ListaException{
		if ((pos <= this.longitud) && (pos >= 0)){
			Nodo n = new Nodo(valor);
			if (pos == 0){
				if (this.cabeza == null){
					this.cabeza = n;
					this.cola = n;
				}
				else{
					this.cabeza.setAnterior(n);
					n.setSiguiente(this.cabeza);
					this.cabeza = n;
				}
			}
			else if (pos == this.longitud){
				this.cola.setSiguiente(n);
				n.setAnterior(this.cola);
				this.cola = n;
			}
			else{
				int i = 0;
				Nodo actual = this.cabeza;
				while (i < pos){
					actual = actual.getSiguiente();
					i++;
				}
				actual.getAnterior().setSiguiente(n);
				n.setAnterior(actual.getAnterior());
				actual.setAnterior(n);
				n.setSiguiente(actual);
			}
			this.longitud+=1;
		}
		else{
			throw new ListaException("La posicion ingresada no es valida para como posicion de un nuevo elemento.");
		}
	}
	
	/**
     * Elimina la ulitma posicion de la lista.
     */
	public void remove(){
		if (this.cola != null){
			this.cola.getAnterior().setSiguiente(null);
			this.cola=this.cola.getAnterior();
		}
		this.longitud+=-1;
	}

	/**
     * Remueve un valor de la lista dadp su posicion.
     * @param pos que es la posicion que se quiere eliminar de la lista. 
     */
	public void remove(int pos) throws ListaException{
		if ((pos < this.longitud) && (pos >= 0)){
			int i = 0;
			Nodo actual = this.cabeza;
			while (i < pos){
				actual = actual.getSiguiente();
				i++;
			}
			if (actual.getSiguiente() != null){
				actual.getSiguiente().setAnterior(actual.getAnterior());
			}
			else{
				this.cola = actual.getAnterior();
			}
			if (actual.getAnterior() != null){
				actual.getAnterior().setSiguiente(actual.getSiguiente());
			}
			else{
				this.cabeza = actual.getSiguiente();
			}
			this.longitud+=-1;
		}
		else{
			throw new ListaException("La posicion ingresada no corresponde a una posicion que se encuentre en la lista.");
		}
	}	
	
	/**
     * Retorna la ultima posicion de la lista.
     * @return int con el valor de la longitud de la lista. 
     */
	public int getLongitud(){
		return this.longitud;
	}

	/**
     * Retorna la lista representada como una cadena.
     * @return String la cadena que representa la lista.
     */
	public String toString(){
		String lista = "[";
		int i = 0;
		Nodo actual = this.cabeza;
		while (i < this.longitud){
			if ((i + 1) == this.longitud){
				lista += actual.getValor();
			}
			else{
				lista += actual.getValor() + ", ";
			}
			actual = actual.getSiguiente();
			i++;
		} 
		lista+= "]";
		return lista;
	}
}