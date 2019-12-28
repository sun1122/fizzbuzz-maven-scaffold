import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author flysun55
 * @date 2019/12/28
 */

public class FizzBuzzTest {

    @Test
    public void testSayFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3, 5));
    }

    @Test
    public void testSayBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 3, 5));
    }

    @Test
    public void testSayFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 3, 5));
    }

    @Test
    public void testSayOtherNum(){
        assertEquals("4",FizzBuzz.fizzBuzz(4,3,5));
    }
}
