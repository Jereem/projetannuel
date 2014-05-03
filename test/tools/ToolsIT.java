/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import beans.Etudiant;
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
 * @author jeremygillet
 */
public class ToolsIT {
    
    public ToolsIT() {
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
     * Test of saveNewAdherent method, of class Tools.
     */
    @Test
    public void testSaveNewAdherent() throws Exception {
        System.out.println("saveNewAdherent");
        Etudiant adherent = null;
        Tools instance = new Tools();
        String expResult = "";
        String result = instance.saveNewAdherent(adherent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdherent method, of class Tools.
     */
    @Test
    public void testGetAdherent() throws Exception {
        System.out.println("getAdherent");
        Tools instance = new Tools();
        List<Etudiant> expResult = null;
        List<Etudiant> result = instance.getAdherent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOldAdherent method, of class Tools.
     */
    @Test
    public void testGetOldAdherent() throws Exception {
        System.out.println("getOldAdherent");
        Tools instance = new Tools();
        List<Etudiant> expResult = null;
        List<Etudiant> result = instance.getOldAdherent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateJavaToSQL method, of class Tools.
     */
    @Test
    public void testDateJavaToSQL() {
        System.out.println("dateJavaToSQL");
        Date datejava = null;
        Tools instance = new Tools();
        String expResult = "";
        String result = instance.dateJavaToSQL(datejava);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateSQLToJava method, of class Tools.
     */
    @Test
    public void testDateSQLToJava() {
        System.out.println("dateSQLToJava");
        String dateSQL = "89-06-21";
        Tools instance = new Tools();
        Date expResult = new Date(21-06-89);
        Date result = instance.dateSQLToJava(dateSQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
