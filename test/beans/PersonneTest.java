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
public class PersonneTest {
    
    public PersonneTest() {
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
     * Test of getTitres method, of class Personne.
     */
    @Test
    public void testGetTitres() {
        System.out.println("getTitres");
        Personne instance = new Personne();
        Personne.Titres[] expResult = null;
        Personne.Titres[] result = instance.getTitres();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitresString method, of class Personne.
     */
    @Test
    public void testGetTitresString() {
        System.out.println("getTitresString");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.getTitresString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitres method, of class Personne.
     */
    @Test
    public void testSetTitres() {
        System.out.println("setTitres");
        String pTitres = "";
        Personne instance = new Personne();
        instance.setTitres(pTitres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Personne.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Personne instance = new Personne();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Personne.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Personne instance = new Personne();
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitre method, of class Personne.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Personne instance = new Personne();
        Personne.Titres expResult = null;
        Personne.Titres result = instance.getTitre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitre method, of class Personne.
     */
    @Test
    public void testSetTitre() {
        System.out.println("setTitre");
        Personne.Titres titre = null;
        Personne instance = new Personne();
        instance.setTitre(titre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordonnees method, of class Personne.
     */
    @Test
    public void testGetCoordonnees() {
        System.out.println("getCoordonnees");
        Personne instance = new Personne();
        Coordonnees expResult = null;
        Coordonnees result = instance.getCoordonnees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoordonnees method, of class Personne.
     */
    @Test
    public void testSetCoordonnees() {
        System.out.println("setCoordonnees");
        Coordonnees coordonnees = null;
        Personne instance = new Personne();
        instance.setCoordonnees(coordonnees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePersonne method, of class Personne.
     */
    @Test
    public void testSavePersonne() {
        System.out.println("savePersonne");
        Personne instance = new Personne();
        instance.savePersonne();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyCoordonnees method, of class Personne.
     */
    @Test
    public void testModifyCoordonnees() throws Exception {
        System.out.println("modifyCoordonnees");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.modifyCoordonnees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
