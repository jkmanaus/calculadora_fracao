/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcalculadorafracao;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class PCalculadoraTest {
    
    public PCalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of somar method, of class PCalculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int num1 = 10;
        int den1 = 2;
        int num2 = 12;
        int den2 = 3;
        PCalculadora instance = new PCalculadora();
        double expResult = 14.0;
        double result = instance.somar(num1, den1, num2, den2);
        assert(expResult == result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class PCalculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int num1 = 10;
        int den1 = 2;
        int num2 = 12;
        int den2 = 3;
        PCalculadora instance = new PCalculadora();
        double expResult = -4.0;
        double result = instance.subtrair(num1, den1, num2, den2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class PCalculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int num1 = 10;
        int den1 = 2;
        int num2 = 12;
        int den2 = 3;
        PCalculadora instance = new PCalculadora();
        double expResult = 20.0;
        double result = instance.multiplicar(num1, den1, num2, den2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class PCalculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int num1 = 10;
        int den1 = 2;
        int num2 = 12;
        int den2 = 3;
        PCalculadora instance = new PCalculadora();
        double expResult = 1.0;
        double result = instance.dividir(num1, den1, num2, den2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
