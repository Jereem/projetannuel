/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teddy Delavallee
 */
public class BureauProGphyTest {
    
    public BureauProGphyTest() {
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

//    /**
//     * Test of getPoste method, of class BureauProGphy.
//     */
//    @Test
//    public void testGetPoste() {
//        System.out.println("getPoste");
//        BureauProGphy instance = new BureauProGphy();
//        Poste expResult = null;
//        Poste result = instance.getPoste();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPoste method, of class BureauProGphy.
//     */
//    @Test
//    public void testSetPoste() {
//        System.out.println("setPoste");
//        Poste poste = null;
//        BureauProGphy instance = new BureauProGphy();
//        instance.setPoste(poste);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAnneesMembre method, of class BureauProGphy.
//     */
//    @Test
//    public void testGetAnneesMembre() {
//        System.out.println("getAnneesMembre");
//        BureauProGphy instance = new BureauProGphy();
//        ArrayList<Integer> expResult = null;
//        ArrayList<Integer> result = instance.getAnneesMembre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAnneesMembre method, of class BureauProGphy.
//     */
//    @Test
//    public void testSetAnneesMembre() {
//        System.out.println("setAnneesMembre");
//        ArrayList<Integer> anneesMembre = null;
//        BureauProGphy instance = new BureauProGphy();
//        instance.setAnneesMembre(anneesMembre);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAnneeMembre method, of class BureauProGphy.
//     */
//    @Test
//    public void testAddAnneeMembre() {
//        System.out.println("addAnneeMembre");
//        Integer annee = null;
//        BureauProGphy instance = new BureauProGphy();
//        instance.addAnneeMembre(annee);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delAnneeMembre method, of class BureauProGphy.
//     */
//    @Test
//    public void testDelAnneeMembre() {
//        System.out.println("delAnneeMembre");
//        Integer annee = null;
//        BureauProGphy instance = new BureauProGphy();
//        instance.delAnneeMembre(annee);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIdentifiant method, of class BureauProGphy.
//     */
//    @Test
//    public void testGetIdentifiant() {
//        System.out.println("getIdentifiant");
//        BureauProGphy instance = new BureauProGphy();
//        String expResult = "";
//        String result = instance.getIdentifiant();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIdentifiant method, of class BureauProGphy.
//     */
//    @Test
//    public void testSetIdentifiant() {
//        System.out.println("setIdentifiant");
//        String identifiant = "";
//        BureauProGphy instance = new BureauProGphy();
//        instance.setIdentifiant(identifiant);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMdp method, of class BureauProGphy.
//     */
//    @Test
//    public void testGetMdp() {
//        System.out.println("getMdp");
//        BureauProGphy instance = new BureauProGphy();
//        String expResult = "";
//        String result = instance.getMdp();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMdp method, of class BureauProGphy.
//     */
//    @Test
//    public void testSetMdp() {
//        System.out.println("setMdp");
//        String mdp = "";
//        BureauProGphy instance = new BureauProGphy();
//        instance.setMdp(mdp);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getActif method, of class BureauProGphy.
//     */
//    @Test
//    public void testGetActif() {
//        System.out.println("getActif");
//        BureauProGphy instance = new BureauProGphy();
//        boolean expResult = false;
//        boolean result = instance.getActif();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setActif method, of class BureauProGphy.
//     */
//    @Test
//    public void testSetActif() {
//        System.out.println("setActif");
//        boolean actif = false;
//        BureauProGphy instance = new BureauProGphy();
//        instance.setActif(actif);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of saveBureauProGphy method, of class BureauProGphy.
//     */
//    @Test
//    public void testSaveBureauProGphy() throws Exception {
//        System.out.println("saveBureauProGphy");
//        BureauProGphy instance = new BureauProGphy();
//        String expResult = "";
//        String result = instance.saveBureauProGphy();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getBureauProGphy method, of class BureauProGphy.
     */
    @Test
    public void testGetBureauProGphy() throws Exception {
        System.out.println("getBureauProGphy");
        BureauProGphy instance = new BureauProGphy();
        List<BureauProGphy> expResult = null;
        List<BureauProGphy> result = instance.getBureauProGphy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
