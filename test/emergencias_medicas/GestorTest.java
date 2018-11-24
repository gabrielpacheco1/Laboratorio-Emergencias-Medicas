/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencias_medicas;

import emergencias_medicas.arrays.ArrayMovil;
import emergencias_medicas.arrays.ArrayPersonas;
import emergencias_medicas.arrays.ArraySolicitudes;
import excepciones.ObjExistenteExcepcion;
import excepciones.ObjInexistenteExcepcion;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Mansilla
 */
public class GestorTest {
    
    Gestor gestor;
    
    public GestorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        gestor = new Gestor(new ArrayMovil(),new ArrayPersonas (),new ArraySolicitudes (),new Tarifa ());
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void agregarCuentas() {
        Calendar fecha= Calendar.getInstance();
        Pago pago = new Pago(fecha,150f);
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996511","masculino",3834648,"romis raiden",fecha,pago));
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996512","masculino",3834648,"romis raiden",fecha,pago));
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996513","masculino",3834648,"romis raiden",fecha,pago));        
        assertEquals(gestor.getPersonas().size(), 3);
    }
    @Test
    
    public void eliminarCuentas() {
        Calendar fecha= Calendar.getInstance();
        Pago pago = new Pago(fecha,150f);
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996511","masculino",3834648,"romis raiden",fecha,pago));
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996512","masculino",3834648,"romis raiden",fecha,pago));
        gestor.eliminarPersona("39996511");        
        assertEquals(gestor.getPersonas().size(), 1);
    }
    
    
    
    @Test(expected=ObjExistenteExcepcion.class)
    public void agregarCuentaExistente() {  
        Calendar fecha= Calendar.getInstance();
        Pago pago = new Pago(fecha,150f);
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996511","masculino",3834648,"romis raiden",fecha,pago));
        gestor.agregarPersona(new Afiliado("carlos", "mansilla", "39996511","masculino",3834648,"romis raiden",fecha,pago));
    }
    
    @Test(expected=ObjInexistenteExcepcion.class)
    public void eliminarCuentaInexistente() {     
         gestor.eliminarPersona("1"); 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
