package edu.escuelaing.arep.designprimer.model;

import edu.escuelaing.arep.designprimer.exceptions.ListaException;

/**
 * Interfaz de una lista
 * @author Julian Gutierrez
 * @version 1.0
 */
public interface Lista {

    /**
     * Retorna la primera posicion de la lista.
     * @return Nodo que es la primera posicion de la lista. 
     */
    public Nodo getCabeza(); 
    
    /**
     * Retorna la ulitma posicion de la lista.
     * @return Nodo que es la ultima posicion de la lista. 
     */
    public Nodo getCola();

    /**
     * Retorna un elemento de la lista dada su pocision.
     * @param pos posicion que se desea retornar.
	 * @return Nodo si la posicion dada se encuentra en la lista o null de lo contrario. 
     * @throws ListaException en caso de que la posicion ingresada sea mayor-igual a la longitud del arreglo o sea un número negativo.
     */
	public Nodo get(int pos) throws ListaException;

    /**
     * Agrega un valor a la ulitma posicion de la lista.
     * @param valor el cual es el valor que se quiere ingresar en la lista. 
     */
    public void add(double valor);

    /**
     * Agrega un valor a la lista.
	 * @param valor el valor a inglresar en la lista.
     * @param pos que es la posicion que se quiere eliminar de la lista. 
     * @throws ListaException en caso de que la posicion ingresada sea mayor-igual a la longitud del arreglo o sea un número negativo.
     */
	public void add(double valor, int pos) throws ListaException;

    /**
     * Elimina la ulitma posicion de la lista.
     */
	public void remove();

    /**
     * Remueve un valor de la lista.
     * @param pos que es la posicion que se quiere eliminar de la lista. 
     * @throws ListaException en caso de que la posicion ingresada sea mayor-igual a la longitud del arreglo o sea un número negativo.
     */
    public void remove(int pos) throws ListaException;

     /**
     * Retorna la ultima posicion de la lista.
     * @return int con el valor de la longitud de la lista. 
     */
    public int getLongitud();

    /**
     * Retorna la lista representada como una cadena.
     * @return String la cadena que representa la lista.
     */
	public String toString();

}