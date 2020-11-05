/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import java.security.InvalidParameterException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.ExternalResource;
import org.junit.rules.Timeout;

/**
 *
 * @author ivand
 */
public class AvaluadorTest3 {
    
private Avaluador instance;
    
     @Rule
    public final ExpectedException exception = ExpectedException.none();
     
         @Rule 
    public Timeout timeout = Timeout.millis(100);
    
    public AvaluadorTest3() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inciant test ....");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant test....");
    }
    
    @Before
    public void setUp() {
        instance= new Avaluador();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        exception.expect(Exception.class);
        exception.expectCause(CoreMatchers.isA(InvalidParameterException.class));
        exception.expectMessage("Estudiant no pot ser null");
        instance.mitjanaSiSupera(null);
    }
    
    @Test
    public void testMitjana() throws Exception {
        exception.expect(Exception.class);
        exception.expectCause(CoreMatchers.isA(InvalidParameterException.class));
        exception.expectMessage("Estudiant no pot ser null");
        instance.mitjana(null);
    }


    @Ignore
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
}
    
}