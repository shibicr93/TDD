package fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {




    @Test
    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.result(9);
        Assert.assertEquals("fizz",result);
    }

    @Test
    public void testFizzNonMultiple35() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.result(2);
        Assert.assertEquals("",result);
    }


    @Test
    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.result(25);
        Assert.assertEquals("buzz",result);
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.result(15);
        Assert.assertEquals("fizzbuzz",result);

    }
}