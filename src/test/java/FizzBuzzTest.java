import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void givenZero_returnsEmptyString() {

        assertEquals("", fizzBuzz.getResult(0));
    }

    @Test
    public void givenMinusOne_returnEmptyString() {
        assertEquals("", fizzBuzz.getResult(-1));
    }

    @Test
    public void givenOne_returnNumberOne() {
        assertEquals("1", fizzBuzz.getResult(1));
    }

    @Test
    public void givenTwo_returnTwo() {
        assertEquals("2", fizzBuzz.getResult(2));
    }

    @Test
    public void givenThree_returnFizz() {
        assertEquals("Fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void givenFour_ReturnFour() {
        assertEquals("4", fizzBuzz.getResult(4));
    }

    @Test
    public void givenFive_returnBuzz() {
        assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void givenSix_returnFizz() {
        assertEquals("Fizz", fizzBuzz.getResult(6));
    }

    @Test
    public void givenSeven_returnSeven() {
        assertEquals("7", fizzBuzz.getResult(7));
    }

    @Test
    public void givenFifteen_returnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
    }

    @Test
    public void givenSixteen_returnsSixteen() {
        assertEquals("16", fizzBuzz.getResult(16));
    }

    @Test
    public void givenThirty_returnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.getResult(30));
    }
}
