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

/**
 *
 * @author jeremygillet
 */
public class DocumentsTest {
    
    public DocumentsTest() {
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
     * Test of getProjet method, of class Documents.
     */
    @Test
    public void testGetProjet() {
        System.out.println("getProjet");
        Documents instance = new Documents();
        Projet expResult = null;
        Projet result = instance.getProjet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProjet method, of class Documents.
     */
    @Test
    public void testSetProjet() {
        System.out.println("setProjet");
        Projet projet = null;
        Documents instance = new Documents();
        instance.setProjet(projet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomDoc method, of class Documents.
     */
    @Test
    public void testGetNomDoc() {
        System.out.println("getNomDoc");
        Documents instance = new Documents();
        String expResult = "";
        String result = instance.getNomDoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomDoc method, of class Documents.
     */
    @Test
    public void testSetNomDoc() {
        System.out.println("setNomDoc");
        String nomDoc = "";
        Documents instance = new Documents();
        instance.setNomDoc(nomDoc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeDoc method, of class Documents.
     */
    @Test
    public void testGetTypeDoc() {
        System.out.println("getTypeDoc");
        Documents instance = new Documents();
        String expResult = "";
        String result = instance.getTypeDoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeDoc method, of class Documents.
     */
    @Test
    public void testSetTypeDoc() {
        System.out.println("setTypeDoc");
        String typeDoc = "";
        Documents instance = new Documents();
        instance.setTypeDoc(typeDoc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListMetaData method, of class Documents.
     */
    @Test
    public void testGetListMetaData() {
        System.out.println("getListMetaData");
        Documents instance = new Documents();
        ArrayList<MetaData> expResult = null;
        ArrayList<MetaData> result = instance.getListMetaData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListMetaData method, of class Documents.
     */
    @Test
    public void testSetListMetaData() {
        System.out.println("setListMetaData");
        ArrayList<MetaData> listMetaData = null;
        Documents instance = new Documents();
        instance.setListMetaData(listMetaData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMetaData method, of class Documents.
     */
    @Test
    public void testAddMetaData() {
        System.out.println("addMetaData");
        MetaData metaData = null;
        Documents instance = new Documents();
        instance.addMetaData(metaData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delMetaData method, of class Documents.
     */
    @Test
    public void testDelMetaData() {
        System.out.println("delMetaData");
        MetaData metaData = null;
        Documents instance = new Documents();
        instance.delMetaData(metaData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmplacement method, of class Documents.
     */
    @Test
    public void testGetEmplacement() {
        System.out.println("getEmplacement");
        Documents instance = new Documents();
        String expResult = "";
        String result = instance.getEmplacement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmplacement method, of class Documents.
     */
    @Test
    public void testSetEmplacement() {
        System.out.println("setEmplacement");
        String emplacement = "";
        Documents instance = new Documents();
        instance.setEmplacement(emplacement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuteur method, of class Documents.
     */
    @Test
    public void testGetAuteur() {
        System.out.println("getAuteur");
        Documents instance = new Documents();
        BureauProGphy expResult = null;
        BureauProGphy result = instance.getAuteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuteur method, of class Documents.
     */
    @Test
    public void testSetAuteur() {
        System.out.println("setAuteur");
        BureauProGphy auteur = null;
        Documents instance = new Documents();
        instance.setAuteur(auteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class Documents.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Documents instance = new Documents();
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnee method, of class Documents.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 0;
        Documents instance = new Documents();
        instance.setAnnee(annee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recupDocuments method, of class Documents.
     */
    @Test
    public void testRecupDocuments_3args() {
        System.out.println("recupDocuments");
        String type = "";
        int annee = 0;
        String projet = "";
        Documents instance = new Documents();
        Documents expResult = null;
        Documents result = instance.recupDocuments(type, annee, projet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recupDocuments method, of class Documents.
     */
    @Test
    public void testRecupDocuments_int() {
        System.out.println("recupDocuments");
        int annee = 0;
        Documents instance = new Documents();
        Documents expResult = null;
        Documents result = instance.recupDocuments(annee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recupDocuments method, of class Documents.
     */
    @Test
    public void testRecupDocuments_String() {
        System.out.println("recupDocuments");
        String projet = "";
        Documents instance = new Documents();
        Documents expResult = null;
        Documents result = instance.recupDocuments(projet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recupDocuments method, of class Documents.
     */
    @Test
    public void testRecupDocuments_String_String() {
        System.out.println("recupDocuments");
        String projet = "";
        String type = "";
        Documents instance = new Documents();
        Documents expResult = null;
        Documents result = instance.recupDocuments(projet, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveDocument method, of class Documents.
     */
    @Test
    public void testSaveDocument() throws Exception {
        System.out.println("saveDocument");
        Documents myDoc = null;
        int id_projet = 0;
        String Identifiant = "";
        Documents instance = new Documents();
        instance.saveDocument(myDoc, id_projet, Identifiant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
