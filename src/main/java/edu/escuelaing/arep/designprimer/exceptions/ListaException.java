package edu.escuelaing.arep.designprimer.exceptions;


/**
 * Clase de excpeciones de la interfaz lista
 * @author Julian Gutierrez
 * @version 1.0
 */

public class ListaException extends Exception {
   
    private static final long serialVersionUID = -9057269393156569536L;

    public ListaException(String msg) {
        super(msg);
    }
	
	public ListaException(String msg, Exception e) {
        super(msg,e);
    
    }
}