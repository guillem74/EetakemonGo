/**
 * Created by Mikel on 15/03/2017.
 */
import Controlador.Controlador;

import static org.junit.Assert.*;


public class Test {

    @org.junit.Test
    public void prueba(){
        Controlador c = Controlador.getControlador();
        boolean b=c.borrarEetakemonPorId(3);
        assertTrue(b==false);
    }
}
