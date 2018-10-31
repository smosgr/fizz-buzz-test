public class FizzBuzz {
    public String execute(int i) {

        if ((i % 3) == 0) {
            return "Fizz";
        } else if ((i % 5) == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
