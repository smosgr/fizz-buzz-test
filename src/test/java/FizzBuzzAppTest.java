import org.junit.Test;

public class FizzBuzzAppTest {

    @Test(expected=Exception.class)
    public void givenInvalidStringInput_returnException() {
        FizzBuzzApp.main(new String[] { "fail" });
    }
}
