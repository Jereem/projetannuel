/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import static beans.Note.Bon;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jeremygillet
 */
public class CompetencesTest {
    
    public CompetencesTest() {
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
     * Test of getNote method, of class Competences.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Competences instance = new Competences();
        Note expResult =Bon;
        Note result = instance.getNote();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setNote method, of class Competences.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        Note note = Bon;
        Competences instance = new Competences();
        instance.setNote(note);
       
       
    }

    /**
     * Test of getNomCompetence method, of class Competences.
     */
    @Test
    public void testGetNomCompetence() {
        System.out.println("getNomCompetence");
        Competences instance = new Competences();
        String expResult="programmation";
        String result = instance.getNomCompetence();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNomCompetence method, of class Competences.
     */
    @Test
    public void testSetNomCompetence() {
        System.out.println("setNomCompetence");
        String nomCompetence = "";
        Competences instance = new Competences();
        instance.setNomCompetence(nomCompetence);
        
    }
    
}
