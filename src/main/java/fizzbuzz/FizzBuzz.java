package fizzbuzz;

public class FizzBuzz {
    public String result(int input) {
        int mod3  = input % 3;
        int mod5  = input % 5;
        String result = "";
        if(mod3 == 0) {
            result += "fizz";
        }

        if (mod5 == 0) {
            result += "buzz";
        }
        return result;
    }
}
