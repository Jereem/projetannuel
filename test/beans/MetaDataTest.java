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
public class MetaDataTest {
    
    public MetaDataTest() {
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
     * Test of getNomMetaData method, of class MetaData.
     */
    @Test
    public void testGetNomMetaData() {
        System.out.println("getNomMetaData");
        MetaData instance = new MetaDataImpl();
        instance.getNomMetaData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomMetaData method, of class MetaData.
     */
    @Test
    public void testSetNomMetaData() {
        System.out.println("setNomMetaData");
        int nomMetaData = 0;
        MetaData instance = new MetaDataImpl();
        instance.setNomMetaData(nomMetaData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValeur method, of class MetaData.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        MetaData instance = new MetaDataImpl();
        instance.getValeur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValeur method, of class MetaData.
     */
    @Test
    public void testSetValeur() {
        System.out.println("setValeur");
        int valeur = 0;
        MetaData instance = new MetaDataImpl();
        instance.setValeur(valeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MetaDataImpl extends MetaData {
    }
    
}
