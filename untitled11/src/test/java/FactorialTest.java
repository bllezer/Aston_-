import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(0);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testFactorialOfFive() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test
    public void testFactorialOfTen() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(10);
        Assert.assertEquals(result, 3628800);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(-5);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(-10);
        Assert.assertEquals(result, -1);
    }
}