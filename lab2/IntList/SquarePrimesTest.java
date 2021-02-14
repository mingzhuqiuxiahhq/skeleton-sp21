package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSP2(){
        IntList lst = IntList.of(11, 12, 13, 14);
        boolean change = IntListExercises.squarePrimes(lst);
        assertEquals("121 -> 12 -> 169 -> 14", lst.toString());
        assertTrue(change);
    }
    /**
    @Test
    public void testSP3(){
        IntList lst = IntList.of(14, 15, 16);
        boolean sp = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16", lst);
        assertTrue(sp);
    } **/
}
