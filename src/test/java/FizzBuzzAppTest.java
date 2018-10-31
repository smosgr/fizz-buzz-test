import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzAppTest {


    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void test_receives_one_ouputs_one() {

        assertEquals("1", fizzBuzz.execute(1));
    }


    @Test
    public void test_receives_two_ouputs_two() {

        assertEquals("2", fizzBuzz.execute(2));
    }

    @Test
    public void test_receives_three_outputs_fizz() {
        assertEquals("Fizz", fizzBuzz.execute(3));
    }

    @Test
    public void test_receives_six_outputs_fizz() {
        assertEquals("Fizz", fizzBuzz.execute(6));
    }

    @Test
    public void test_receives_five_outputs_buzz() {
        assertEquals("Buzz", fizzBuzz.execute(5));
    }

    @Ignore
    @Test
    public void test_receives_fifteen_outputs_fizzbuzz() {
        assertEquals("FizzBuzz", fizzBuzz.execute(15));
    }

}
