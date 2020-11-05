/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author ivand
 */
@RunWith (Parameterized.class)
    public class AvaluadorTest2 {
    
    private Avaluador Avaluador;
    
    @Parameter(0)
    public Estudiant estudiante;
    @Parameter(1)
    public double media;
    
@Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object [][]{
            {new Estudiant ("Ivan",8.5,6.2,4.5), 6.4},
            {new Estudiant ("Juanito",10.0,10.0,10.0), 10},
            {new Estudiant ("Adara",2.0,3.0,4.0), 3.0},
            {new Estudiant ("Romero",5.0,10.0,0), 5},
            {new Estudiant ("Juan",9.0,5.0,4.0), 6},
            {new Estudiant ("Roberto",5.5,5.0,6.0), 5.5},
            {new Estudiant ("Raul",1.0,9.0,5.0), 5},
            {new Estudiant ("Maria",4.0,6.0,8.0), 6},
            {new Estudiant ("Pep",2.0,6.0,7.0), 5},
            {new Estudiant ("Pepa",2.0,4.0,4.0), 3.33},
            {new Estudiant ("Ferran",8.0,9.0,10.0), 9},
            {new Estudiant ("Laura",1.0,2.0,3.0), 2},
            {new Estudiant ("Dana",6.0,7.0,8.0), 7},
            {new Estudiant ("Carla",5.0,8.0,6.0), 6.33},
            {new Estudiant ("Antonio",8.0,4.0,6.0), 6}
        };

        return Arrays.asList(data);
    }
    public AvaluadorTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        Avaluador = new Avaluador();
        
    }
    
    @After
    public void tearDown() {
        Avaluador = null;
    }

    @Test
    public void testMitjanaSiSupera() throws Exception {

    }

    @Test
    public void testMitjana() throws Exception {
        assertEquals(media,Avaluador.mitjana(estudiante),0.1);
        
    }

    @Test
    public void testMillorEstudiantPerNotaMitjana() {
//        assertEquals("a",Avaluador.millorEstudiantPerNotaMitjana(instance));
    }
    
}