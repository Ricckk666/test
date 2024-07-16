package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testMain(){
        app.main(null);
    }

    @Transientpublic void Appinstance(){
        App x = new App();

    }



}
