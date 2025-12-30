
package javaapplication8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JorgeClassTest {
    
    /**
     * Test de promedioNota (valido sin error)
     */
    @Test
    public void testPromedioNota() {
        System.out.println("promedioNota OK");
        float n1 = 5.0f;
        float n2 = 8.0f;
        float n3 = 7.0f;
        JorgeClass instance = new JorgeClass();
        float expResult = 6.66f;
        float result = instance.promedioNota(n1, n2, n3);
        assertEquals(expResult, result, 0.1);
   
    }

    /**
     * Test de conclusionFinal (invalido, da error)
     */
    @Test
    public void testConclusionFinal() {
        System.out.println("conclusionFinal no OK");
        float promedio = 6.66f;
        JorgeClass instance = new JorgeClass();
        String expResult = "NO APTO. NOTA: "+promedio;
        String result = instance.conclusionFinal(promedio);
        assertEquals(expResult, result);
     
    }
    
}
