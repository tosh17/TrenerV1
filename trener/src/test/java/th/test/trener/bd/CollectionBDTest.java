/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import th.test.trener.eprogs.EDay;
import th.test.trener.eprogs.EExes;
import th.test.trener.eprogs.EPodhod;
import th.test.trener.eprogs.EProg;

/**
 *
 * @author shcherbakov
 */
public class CollectionBDTest {
    EProg eProg;
    static Logger log =LoggerFactory.getLogger("test");
    public CollectionBDTest() {
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
     * Test of init method, of class CollectionBD.
     */
//    @Test
//    public void testInit() {
//        System.out.println("init");
//        IntBD expResult = null;
//        IntBD result = CollectionBD.init();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getExes method, of class CollectionBD.
//     */
    @Test
    public void testGetExes() {
        System.out.println("getExes");
        int id = 5;
        CollectionBD instance = (CollectionBD) CollectionBD.init();
        EExes expResult = CollExes.getExes(id);
        EExes result = instance.getExes(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        log.debug(result.toString());
    }
//
//    /**
//     * Test of getDay method, of class CollectionBD.
//     */
//    @Test
//    public void testGetDay() {
//        System.out.println("getDay");
//        int id = 0;
//        int number = 0;
//        CollectionBD instance = null;
//        EDay expResult = null;
//        EDay result = instance.getDay(id, number);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getProg method, of class CollectionBD.
//     */
//    @Test
//    public void testGetProg() {
//        System.out.println("getProg");
//        int id = 0;
//        CollectionBD instance = null;
//        EProg expResult = null;
//        EProg result = instance.getProg(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of connect method, of class CollectionBD.
//     */
//    @Test
//    public void testConnect() {
//        System.out.println("connect");
//        CollectionBD instance = null;
//        boolean expResult = false;
//        boolean result = instance.connect();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of writeProg method, of class CollectionBD.
//     */
//    @Test
//    public void testWriteProg() {
//        System.out.println("writeProg");
//        EProg prog = null;
//        CollectionBD instance = null;
//        boolean expResult = false;
//        boolean result = instance.writeProg(prog);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of writeDay method, of class CollectionBD.
//     */
//    @Test
//    public void testWriteDay() {
//        System.out.println("writeDay");
//        EDay day = null;
//        CollectionBD instance = null;
//        boolean expResult = false;
//        boolean result = instance.writeDay(day);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of writeExes method, of class CollectionBD.
//     */
//    @Test
//    public void testWriteExes() {
//        System.out.println("writeExes");
//        EExes exes = null;
//        CollectionBD instance = null;
//        boolean expResult = false;
//        boolean result = instance.writeExes(exes);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of writePodhod method, of class CollectionBD.
//     */
//    @Test
//    public void testWritePodhod() {
//        System.out.println("writePodhod");
//        EPodhod podhod = null;
//        CollectionBD instance = null;
//        boolean expResult = false;
//        boolean result = instance.writePodhod(podhod);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPodhod method, of class CollectionBD.
//     */
//    @Test
//    public void testGetPodhod() {
//        System.out.println("getPodhod");
//        int id = 0;
//        CollectionBD instance = null;
//        EPodhod expResult = null;
//        EPodhod result = instance.getPodhod(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of disconnect method, of class CollectionBD.
//     */
//    @Test
//    public void testDisconnect() {
//        System.out.println("disconnect");
//        CollectionBD instance = null;
//        boolean expResult = false;
//        boolean result = instance.disconnect();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
