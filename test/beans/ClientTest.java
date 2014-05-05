/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeremygillet
 */
public class ClientTest {
    
    public ClientTest() {
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
     * Test of getQualite method, of class Client.
     */
    @Test
    public void testGetQualite() {
        System.out.println("getQualite");
        Client instance = new Client();
        instance.setQualite("professeur");
        String expResult = "professeur";
        String result = instance.getQualite();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQualite method, of class Client.
     */
    @Test
    public void testSetQualite() {
        System.out.println("setQualite");
        String qualite = "prof";
        Client instance = new Client();
        instance.setQualite(qualite);
        
    }

    /**
     * Test of getSociete method, of class Client.
     */
    @Test
    public void testGetSociete() {
        System.out.println("getSociete");
        Client instance = new Client();
        String expResult = "NewSociete";
        String result = instance.getSociete();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSociete method, of class Client.
     */
    @Test
    public void testSetSociete() {
        System.out.println("setSociete");
        String societe = "NewSociete";
        Client instance = new Client();
        instance.setSociete(societe);
       
    }

    /**
     * Test of getSiren method, of class Client.
     */
    @Test
    public void testGetSiren() {
        System.out.println("getSiren");
        Client instance = new Client();
        long expResult = 0L;
        long result = instance.getSiren();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSiren method, of class Client.
     */
    @Test
    public void testSetSiren() {
        System.out.println("setSiren");
        long siren = 0L;
        Client instance = new Client();
        instance.setSiren(siren);
        
    }

    /**
     * Test of getPoste method, of class Client.
     */
    @Test
    public void testGetPoste() {
        System.out.println("getPoste");
        Client instance = new Client();
        instance.setPoste("president");
        String expResult ="president";
        String result = instance.getPoste();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPoste method, of class Client.
     */
    @Test
    public void testSetPoste() {
        System.out.println("setPoste");
        String qualite = "";
        Client instance = new Client();
        instance.setPoste(qualite);
        
    }
    
}
