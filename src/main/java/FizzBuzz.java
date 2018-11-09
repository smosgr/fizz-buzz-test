public class FizzBuzz {

    public String getResult(int i) {
        if(i > 0) {
            if(isDivisibleByThree(i) && isDivisibleByFive(i)) {
                return "FizzBuzz";
            }
            if(isDivisibleByThree(i)) {
                return "Fizz";
            }
            if(isDivisibleByFive(i)) {
                return "Buzz";
            }
            return String.valueOf(i);
        }
        return "";
    }

    private boolean isDivisibleByFive(int i) {
        return i % 5 == 0;
    }

    private boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }
}
