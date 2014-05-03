/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;
import java.util.Date;
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
public class EtudiantTest {
    
    public EtudiantTest() {
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
//     * Test of getAnneesAdherant method, of class Etudiant.
//     */
//    @Test
//    public void testGetAnneesAdherant() {
//        System.out.println("getAnneesAdherant");
//        Etudiant instance = new Etudiant();
//        ArrayList<Integer> expResult = null;
//        ArrayList<Integer> result = instance.getAnneesAdherant();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAnneesAdherant method, of class Etudiant.
//     */
//    @Test
//    public void testSetAnneesAdherant() {
//        System.out.println("setAnneesAdherant");
//        ArrayList<Integer> anneesAdherant = null;
//        Etudiant instance = new Etudiant();
//        instance.setAnneesAdherant(anneesAdherant);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNumeroSS method, of class Etudiant.
//     */
//    @Test
//    public void testGetNumeroSS() {
//        System.out.println("getNumeroSS");
//        Etudiant instance = new Etudiant();
//        long expResult = 0L;
//        long result = instance.getNumeroSS();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNumeroSS method, of class Etudiant.
//     */
//    @Test
//    public void testSetNumeroSS() {
//        System.out.println("setNumeroSS");
//        long numeroSS = 0L;
//        Etudiant instance = new Etudiant();
//        instance.setNumeroSS(numeroSS);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListeCompetences method, of class Etudiant.
//     */
//    @Test
//    public void testGetListeCompetences() {
//        System.out.println("getListeCompetences");
//        Etudiant instance = new Etudiant();
//        ArrayList<Competences> expResult = null;
//        ArrayList<Competences> result = instance.getListeCompetences();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setListeCompetences method, of class Etudiant.
//     */
//    @Test
//    public void testSetListeCompetences() {
//        System.out.println("setListeCompetences");
//        ArrayList<Competences> listeCompetences = null;
//        Etudiant instance = new Etudiant();
//        instance.setListeCompetences(listeCompetences);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDateNaissance method, of class Etudiant.
//     */
//    @Test
//    public void testGetDateNaissance() {
//        System.out.println("getDateNaissance");
//        Etudiant instance = new Etudiant();
//        Date expResult = null;
//        Date result = instance.getDateNaissance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDateNaissance method, of class Etudiant.
//     */
//    @Test
//    public void testSetDateNaissance() {
//        System.out.println("setDateNaissance");
//        Date dateNaissance = null;
//        Etudiant instance = new Etudiant();
//        instance.setDateNaissance(dateNaissance);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isAJourCotisation method, of class Etudiant.
//     */
//    @Test
//    public void testIsAJourCotisation() {
//        System.out.println("isAJourCotisation");
//        Etudiant instance = new Etudiant();
//        boolean expResult = false;
//        boolean result = instance.isAJourCotisation();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAJourCotisation method, of class Etudiant.
//     */
//    @Test
//    public void testSetAJourCotisation() {
//        System.out.println("setAJourCotisation");
//        boolean AJourCotisation = false;
//        Etudiant instance = new Etudiant();
//        instance.setAJourCotisation(AJourCotisation);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPromotion method, of class Etudiant.
//     */
//    @Test
//    public void testGetPromotion() {
//        System.out.println("getPromotion");
//        Etudiant instance = new Etudiant();
//        int expResult = 0;
//        int result = instance.getPromotion();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPromotion method, of class Etudiant.
//     */
//    @Test
//    public void testSetPromotion() {
//        System.out.println("setPromotion");
//        int promotion = 0;
//        Etudiant instance = new Etudiant();
//        instance.setPromotion(promotion);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAnneeAdherent method, of class Etudiant.
//     */
//    @Test
//    public void testAddAnneeAdherent() {
//        System.out.println("addAnneeAdherent");
//        int annee = 0;
//        Etudiant instance = new Etudiant();
//        instance.addAnneeAdherent(annee);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delAnneeAdherent method, of class Etudiant.
//     */
//    @Test
//    public void testDelAnneeAdherent() {
//        System.out.println("delAnneeAdherent");
//        int annee = 0;
//        Etudiant instance = new Etudiant();
//        instance.delAnneeAdherent(annee);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of saveNewAdherent method, of class Etudiant.
     */
    @Test
    public void testSaveNewAdherent() throws Exception {
        Etudiant adherent = new Etudiant();
        System.out.println("saveNewAdherent");
       
        adherent.setTitres("Mlle");
        adherent.setNom("nom");
        adherent.setPrenom("Prenom");
        adherent.setNumeroSS(123456789012345L);
        //adherent.setDateNaissance('2011-04-13 05:00');
        Coordonnees coordonnes = new Coordonnees();
        coordonnes.setNumRue(2);
        coordonnes.setVoies("Rue");
        coordonnes.setRue("Rue test");
        coordonnes.setCodePostal("28160");
        coordonnes.setVille("Ville");
        coordonnes.setPays("Pays");
        coordonnes.setEmail("Email");
        coordonnes.setTelFixe(0237477007);
        coordonnes.setTelPortable(0237477007);
        adherent.setCoordonnees(coordonnes);
        adherent.setPromotion(2015);
            
        String expResult = "success";
        String result = adherent.saveNewAdherent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
//
//    /**
//     * Test of getAdherent method, of class Etudiant.
//     */
//    @Test
//    public void testGetAdherent() throws Exception {
//        System.out.println("getAdherent");
//        Etudiant instance = new Etudiant();
//        List<Etudiant> expResult = null;
//        List<Etudiant> result = instance.getAdherent();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOldAdherent method, of class Etudiant.
//     */
//    @Test
//    public void testGetOldAdherent() throws Exception {
//        System.out.println("getOldAdherent");
//        Etudiant instance = new Etudiant();
//        List<Etudiant> expResult = null;
//        List<Etudiant> result = instance.getOldAdherent();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
