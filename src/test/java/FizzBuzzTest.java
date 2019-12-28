import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * @author flysun55
 * @date 2019/12/28
 */

public class FizzBuzzTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    
    @Test
    public void should_throw_IAE_give_number_le_0(){
        // given
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
        //when
        FizzBuzz.fizzBuzz(-1,3,5,7);
        //then
    }

    @Test
    public void testSayFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3, 5,7));
    }

    @Test
    public void testSayBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 3, 5,7));
    }

    @Test
    public void testSayFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 3, 5,7));
    }

    @Test
    public void testSayOtherNum(){
        assertEquals("4",FizzBuzz.fizzBuzz(4,3,5,7));
    }

    @Test
    public void testSayFizzBuzzWhizz(){
        assertEquals("FizzBuzzWhizz",FizzBuzz.fizzBuzz(105,3,5,7));
    }


}
