/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import plancelular.PlanCelular;

/**
 *
 * @author pc
 */
public class LecturaArchivoSecuencialTest {
    
    public LecturaArchivoSecuencialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNombreArchivo method, of class LecturaArchivoSecuencial.
     */
    @Test
    public void testEstablecerNombreArchivo() {
        System.out.println("establecerNombreArchivo");
        String n = "";
        LecturaArchivoSecuencial instance = null;
        instance.establecerNombreArchivo(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerListaPlanes method, of class LecturaArchivoSecuencial.
     */
    @Test
    public void testEstablecerListaPlanes() {
        System.out.println("establecerListaPlanes");
        LecturaArchivoSecuencial instance = null;
        instance.establecerListaPlanes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerListaPlanes method, of class LecturaArchivoSecuencial.
     */
    @Test
    public void testObtenerListaPlanes() {
        System.out.println("obtenerListaPlanes");
        LecturaArchivoSecuencial instance = null;
        ArrayList<PlanCelular> expResult = null;
        ArrayList<PlanCelular> result = instance.obtenerListaPlanes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombreArchivo method, of class LecturaArchivoSecuencial.
     */
    @Test
    public void testObtenerNombreArchivo() {
        System.out.println("obtenerNombreArchivo");
        LecturaArchivoSecuencial instance = null;
        String expResult = "";
        String result = instance.obtenerNombreArchivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LecturaArchivoSecuencial.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LecturaArchivoSecuencial instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarArchivo method, of class LecturaArchivoSecuencial.
     */
    @Test
    public void testCerrarArchivo() {
        System.out.println("cerrarArchivo");
        LecturaArchivoSecuencial instance = null;
        instance.cerrarArchivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
