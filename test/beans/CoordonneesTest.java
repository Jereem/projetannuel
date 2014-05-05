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
public class CoordonneesTest {
    
    public CoordonneesTest() {
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
     * Test of getVoies method, of class Coordonnees.
     */
    @Test
    public void testGetVoies() {
        System.out.println("getVoies");
        Coordonnees instance = new Coordonnees();
        Coordonnees.Voies[] expResult = null;
        Coordonnees.Voies[] result = instance.getVoies();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoiesString method, of class Coordonnees.
     */
    @Test
    public void testGetVoiesString() {
        System.out.println("getVoiesString");
        Coordonnees instance = new Coordonnees();
        String expResult = "";
        String result = instance.getVoiesString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoies method, of class Coordonnees.
     */
    @Test
    public void testSetVoies() {
        System.out.println("setVoies");
        String pVoies = "";
        Coordonnees instance = new Coordonnees();
        instance.setVoies(pVoies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRue method, of class Coordonnees.
     */
    @Test
    public void testGetRue() {
        System.out.println("getRue");
        Coordonnees instance = new Coordonnees();
        String expResult = "";
        String result = instance.getRue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRue method, of class Coordonnees.
     */
    @Test
    public void testSetRue() {
        System.out.println("setRue");
        String rue = "";
        Coordonnees instance = new Coordonnees();
        instance.setRue(rue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeVoie method, of class Coordonnees.
     */
    @Test
    public void testGetTypeVoie() {
        System.out.println("getTypeVoie");
        Coordonnees instance = new Coordonnees();
        Coordonnees.Voies expResult = null;
        Coordonnees.Voies result = instance.getTypeVoie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeVoie method, of class Coordonnees.
     */
    @Test
    public void testSetTypeVoie() {
        System.out.println("setTypeVoie");
        Coordonnees.Voies typeVoie = null;
        Coordonnees instance = new Coordonnees();
        instance.setTypeVoie(typeVoie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodePostal method, of class Coordonnees.
     */
    @Test
    public void testGetCodePostal() {
        System.out.println("getCodePostal");
        Coordonnees instance = new Coordonnees();
        String expResult = "";
        String result = instance.getCodePostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodePostal method, of class Coordonnees.
     */
    @Test
    public void testSetCodePostal() {
        System.out.println("setCodePostal");
        String codePostal = "";
        Coordonnees instance = new Coordonnees();
        instance.setCodePostal(codePostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVille method, of class Coordonnees.
     */
    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Coordonnees instance = new Coordonnees();
        String expResult = "";
        String result = instance.getVille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVille method, of class Coordonnees.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Coordonnees instance = new Coordonnees();
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPays method, of class Coordonnees.
     */
    @Test
    public void testGetPays() {
        System.out.println("getPays");
        Coordonnees instance = new Coordonnees();
        String expResult = "";
        String result = instance.getPays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPays method, of class Coordonnees.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "";
        Coordonnees instance = new Coordonnees();
        instance.setPays(pays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumRue method, of class Coordonnees.
     */
    @Test
    public void testGetNumRue() {
        System.out.println("getNumRue");
        Coordonnees instance = new Coordonnees();
        int expResult = 0;
        int result = instance.getNumRue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumRue method, of class Coordonnees.
     */
    @Test
    public void testSetNumRue() {
        System.out.println("setNumRue");
        int numRue = 0;
        Coordonnees instance = new Coordonnees();
        instance.setNumRue(numRue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Coordonnees.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Coordonnees instance = new Coordonnees();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Coordonnees.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Coordonnees instance = new Coordonnees();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelPortable method, of class Coordonnees.
     */
    @Test
    public void testGetTelPortable() {
        System.out.println("getTelPortable");
        Coordonnees instance = new Coordonnees();
        int expResult = 0;
        int result = instance.getTelPortable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelPortable method, of class Coordonnees.
     */
    @Test
    public void testSetTelPortable() {
        System.out.println("setTelPortable");
        int telPortable = 0;
        Coordonnees instance = new Coordonnees();
        instance.setTelPortable(telPortable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelFixe method, of class Coordonnees.
     */
    @Test
    public void testGetTelFixe() {
        System.out.println("getTelFixe");
        Coordonnees instance = new Coordonnees();
        int expResult = 0;
        int result = instance.getTelFixe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelFixe method, of class Coordonnees.
     */
    @Test
    public void testSetTelFixe() {
        System.out.println("setTelFixe");
        int telFixe = 0;
        Coordonnees instance = new Coordonnees();
        instance.setTelFixe(telFixe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
