/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittodl.hellojenkins;

import hellojenkins.HelloJenkins;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrator
 */
public class HelloJenkinsTest {
    
    public HelloJenkinsTest() {
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
     * Test of main method, of class HelloJenkins.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloJenkins.main(args);
       
    }

    /**
     * Test of testTheNumber method, of class HelloJenkins.
     */
    @Test
    public void testTestTheNumber() {
        System.out.println("testTheNumber");
        int expResult = 6;
        int result = HelloJenkins.testTheNumber();
        assertEquals(expResult, result);
        
    }
    
}
