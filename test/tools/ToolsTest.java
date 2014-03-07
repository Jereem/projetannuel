/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import beans.Etudiant;
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
public class ToolsTest {
    
    public ToolsTest() {
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
//     * Test of saveNewAdherent method, of class Tools.
//     */
//    @Test
//    public void testSaveNewAdherent() throws Exception {
//        System.out.println("saveNewAdherent");
//        Etudiant adherent = null;
//        Tools instance = new Tools();
//        String expResult = "";
//        String result = instance.saveNewAdherent(adherent);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getNewAdherent method, of class Tools.
     */
    @Test
    public void testGetNewAdherent() throws Exception {
        System.out.println("getNewAdherent");
        Tools instance = new Tools();
        List<Etudiant> expResult = null;
        List<Etudiant> result = instance.getNewAdherent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
