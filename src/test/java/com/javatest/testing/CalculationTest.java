package com.javatest.testing;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculationTest extends TestCase {


	@Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  

}
