/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivand
 */
public class AvaluadorTest1 {
    private Estudiant estudiant;
    private Avaluador avaluador;
    
    public AvaluadorTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando texto...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando texto...");
    }
    
    @Before
    public void setUp() {
        avaluador = new Avaluador();      
    }
    
    @After
    public void tearDown() {
        estudiant = null;
        avaluador = null;
    }


    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(10.0, avaluador.mitjanaSiSupera(new Estudiant("Ivan", 10.0, 10.0, 10.0)), 1.0E-3);
    }


    @Test
    public void testMitjana() throws Exception {
        assertEquals(10.0, avaluador.mitjana(new Estudiant("Ivan", 10.0, 10.0, 10.0)), 1.0E-3);
    }

    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        Estudiant [] estudiants = new Estudiant[] {new Estudiant("Ivan", 9.0, 5.0, 2.0), 
                                                new Estudiant("Maribel", 5.0, 6.0, 5.0),
                                                new Estudiant("Ramon", 7.0, 2.0, 1.0),
                                                new Estudiant("Pep", 6.0, 4.0, 3.0),
                                                new Estudiant("Maribel", 10.0, 10.0, 10.0),
                                                new Estudiant("Ana", 1.0, 6.0, 9.0)};        
       assertEquals(estudiants[4],avaluador.millorEstudiantPerNotaMitjana(estudiants));
    }
}
