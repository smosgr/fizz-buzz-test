public class FizzBuzzApp {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        try {
            int input = Integer.parseInt(args[0]);
            System.out.println(fizzBuzz.getResult(input));

        } catch (Exception e) {
            throw e;
        }
    }
}
