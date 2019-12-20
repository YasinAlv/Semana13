/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import entidades.Categoria;
import entidades.Entidad;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jherom Chacon
 */
public class BaseDatosIT {
    
    public BaseDatosIT() {
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
     * Test of setDato method, of class BaseDatos.
     */
    
    /**
     * Test of getDato method, of class BaseDatos.
     */
    @Test
    public void testSetGetDato() {
        System.out.println("Testing setDato and getDato");
        BaseDatos instance = new BaseDatos();
        instance.setDato(new Categoria(1));
        Categoria expResult = new Categoria(1);
        Categoria result = (Categoria)instance.getDato();
        assertEquals(expResult.getId(), result.getId());
    }

    /**
     * Test of salvar method, of class BaseDatos.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        BaseDatos instance = new BaseDatos();
        instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class BaseDatos.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        BaseDatos instance = new BaseDatos();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class BaseDatos.
     */
    @Test
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        int id = 0;
        BaseDatos instance = new BaseDatos();
        instance.consultar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
