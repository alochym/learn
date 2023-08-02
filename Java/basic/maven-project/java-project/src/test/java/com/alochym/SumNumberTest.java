package com.alochym;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class SumNumberTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SumNumberTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SumNumberTest.class );
    }

    public void testSumNumber()
    {
        int expected = 2;
        Assert.assertEquals( expected, SumNumber.Sum(1,2) );
    }
}
