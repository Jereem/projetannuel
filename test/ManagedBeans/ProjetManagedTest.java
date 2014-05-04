/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBeans;

import beans.Projet;
import java.util.List;
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
public class ProjetManagedTest {
    
    public ProjetManagedTest() {
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
     * Test of getSelectedProjet method, of class ProjetManaged.
     */
    @Test
    public void testGetSelectedProjet() {
        System.out.println("getSelectedProjet");
        ProjetManaged instance = new ProjetManaged();
        Projet expResult = new Projet();
        Projet result = instance.getSelectedProjet();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSelectedProjet method, of class ProjetManaged.
     */
    @Test
    public void testSetSelectedProjet() {
        System.out.println("setSelectedProjet");
        Projet selectedProjet = new Projet();
        ProjetManaged instance = new ProjetManaged();
        instance.setSelectedProjet(selectedProjet);
        
    }

    /**
     * Test of saveProjet method, of class ProjetManaged.
     */
    @Test
    public void testSaveProjet() throws Exception {
        System.out.println("saveProjet");
        ProjetManaged instance = new ProjetManaged();
        String expResult = "failed";
        String result = instance.saveProjet();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getProjet method, of class ProjetManaged.
     */
    @Test
    public void testGetProjet() throws Exception {
        System.out.println("getProjet");
        Boolean actif = null;
        ProjetManaged instance = new ProjetManaged();
        List<Projet> expResult = null;
        List<Projet> result = instance.getProjet(actif);
        assertEquals(expResult, result);
       
    }
    
}
