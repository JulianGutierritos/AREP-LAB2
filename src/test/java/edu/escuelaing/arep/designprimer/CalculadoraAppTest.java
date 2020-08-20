package edu.escuelaing.arep.designprimer;

import org.junit.Test;
import java.io.IOException;
import junit.framework.Assert;
import edu.escuelaing.arep.designprimer.exceptions.ListaException;
import edu.escuelaing.arep.designprimer.model.*;

/**
 * Clase de pruebas
 * @author Julian Gutierrez
 * @version 1.0
 */

public class CalculadoraAppTest{
    
    @Test
    public void CalcularMediaYDesviacion1() throws IOException {
        String resp = CalculadoraApp.calcularMediaYDesviacion("src/test/java/edu/escuelaing/arep/designprimer/Prueba2.txt");
        Assert.assertEquals("Mean: 60.32 Std.Dev: 62.26", resp);
    }


    @Test
    public void CalcularMediaYDesviacion2() throws IOException {
        String resp = CalculadoraApp.calcularMediaYDesviacion("src/test/java/edu/escuelaing/arep/designprimer/Prueba1.txt");
        Assert.assertEquals("Mean: 550.6 Std.Dev: 572.03", resp);
    }

    @Test
    public void probarLista() {
        Lista lista = new LinkedList();
        try{
            //Deberia agregar y eliminar los siguientes elementos
            lista.add(3.0, 0);
            Assert.assertTrue(lista.get(0).getValor() == 3.0);
            lista.add(5.0, 1);
            Assert.assertTrue(lista.get(1).getValor() == 5.0);
            lista.add(2.0, 0);
            Assert.assertTrue(lista.get(0).getValor() == 2.0);
            lista.add(4.0, 1);
            Assert.assertTrue(lista.get(1).getValor() == 4.0);
            lista.add(6.0);
            Assert.assertTrue(lista.getCola().getValor() == 6.0);
            lista.remove();
            lista.remove(0);
            lista.remove(1);
            lista.remove();
            Assert.assertTrue("[4.0]".equals(lista.toString()));
        } catch (ListaException e){
            Assert.fail();
        }
        try{
            //No deberia dejar eliminar la posicion porque se sale de la lista
            lista.remove(1);
            Assert.fail();
        } catch (ListaException e){}
        try{
            //No deberia dejar agregar el elmento porque la posicion se sale de la lista
            lista.add(5.0, 2);
            Assert.fail();
        } catch (ListaException e){}
    }

}