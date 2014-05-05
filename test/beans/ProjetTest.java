/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author jeremygillet
 */
public class ProjetTest {
    
    public ProjetTest() {
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
     * Test of getID method, of class Projet.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Projet instance = new Projet();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Projet.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Projet instance = new Projet();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedDocument method, of class Projet.
     */
    @Test
    public void testGetSelectedDocument() {
        System.out.println("getSelectedDocument");
        Projet instance = new Projet();
        Documents expResult = null;
        Documents result = instance.getSelectedDocument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedDocument method, of class Projet.
     */
    @Test
    public void testSetSelectedDocument() {
        System.out.println("setSelectedDocument");
        Documents selectedDocument = null;
        Projet instance = new Projet();
        instance.setSelectedDocument(selectedDocument);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc method, of class Projet.
     */
    @Test
    public void testGetDoc() {
        System.out.println("getDoc");
        Projet instance = new Projet();
        String expResult = "";
        String result = instance.getDoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChefDeProjet method, of class Projet.
     */
    @Test
    public void testGetChefDeProjet() {
        System.out.println("getChefDeProjet");
        Projet instance = new Projet();
        BureauProGphy expResult = null;
        BureauProGphy result = instance.getChefDeProjet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChefDeProjet method, of class Projet.
     */
    @Test
    public void testSetChefDeProjet() {
        System.out.println("setChefDeProjet");
        BureauProGphy chefDeProjet = null;
        Projet instance = new Projet();
        instance.setChefDeProjet(chefDeProjet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommercial method, of class Projet.
     */
    @Test
    public void testGetCommercial() {
        System.out.println("getCommercial");
        Projet instance = new Projet();
        BureauProGphy expResult = null;
        BureauProGphy result = instance.getCommercial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommercial method, of class Projet.
     */
    @Test
    public void testSetCommercial() {
        System.out.println("setCommercial");
        BureauProGphy commercial = null;
        Projet instance = new Projet();
        instance.setCommercial(commercial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class Projet.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        Projet instance = new Projet();
        Client expResult = null;
        Client result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class Projet.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        Client client = null;
        Projet instance = new Projet();
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDevellopeurs method, of class Projet.
     */
    @Test
    public void testGetDevellopeurs() {
        System.out.println("getDevellopeurs");
        Projet instance = new Projet();
        ArrayList<Etudiant> expResult = null;
        ArrayList<Etudiant> result = instance.getDevellopeurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDevellopeurs method, of class Projet.
     */
    @Test
    public void testSetDevellopeurs() {
        System.out.println("setDevellopeurs");
        ArrayList<Etudiant> devellopeurs = null;
        Projet instance = new Projet();
        instance.setDevellopeurs(devellopeurs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomProjet method, of class Projet.
     */
    @Test
    public void testGetNomProjet() {
        System.out.println("getNomProjet");
        Projet instance = new Projet();
        String expResult = "";
        String result = instance.getNomProjet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomProjet method, of class Projet.
     */
    @Test
    public void testSetNomProjet() {
        System.out.println("setNomProjet");
        String nomProjet = "";
        Projet instance = new Projet();
        instance.setNomProjet(nomProjet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocuments method, of class Projet.
     */
    @Test
    public void testGetDocuments() {
        System.out.println("getDocuments");
        Projet instance = new Projet();
        ArrayList<Documents> expResult = null;
        ArrayList<Documents> result = instance.getDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocuments method, of class Projet.
     */
    @Test
    public void testSetDocuments() {
        System.out.println("setDocuments");
        ArrayList<Documents> documents = null;
        Projet instance = new Projet();
        instance.setDocuments(documents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDevellopeurs method, of class Projet.
     */
    @Test
    public void testAddDevellopeurs() {
        System.out.println("addDevellopeurs");
        Etudiant etu = null;
        Projet instance = new Projet();
        instance.addDevellopeurs(etu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocument method, of class Projet.
     */
    @Test
    public void testAddDocument() {
        System.out.println("addDocument");
        Documents document = null;
        Projet instance = new Projet();
        instance.addDocument(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delDocument method, of class Projet.
     */
    @Test
    public void testDelDocument() {
        System.out.println("delDocument");
        Documents document = null;
        Projet instance = new Projet();
        instance.delDocument(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onProjectChosen method, of class Projet.
     */
    @Test
    public void testOnProjectChosen() {
        System.out.println("onProjectChosen");
        SelectEvent event = null;
        Projet instance = new Projet();
        instance.onProjectChosen(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgression method, of class Projet.
     */
    @Test
    public void testGetProgression() {
        System.out.println("getProgression");
        Projet instance = new Projet();
        int expResult = 0;
        int result = instance.getProgression();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgression method, of class Projet.
     */
    @Test
    public void testSetProgression() {
        System.out.println("setProgression");
        int progression = 0;
        Projet instance = new Projet();
        instance.setProgression(progression);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
