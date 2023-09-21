import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorIsPositiveTest {
    Calculator calc = Calculator.instance.get();

    @Test
    public void testIsValid_validArguments() {

        //given
        int a = 16;

        //when

        boolean result = calc.isPositive.test(a);

        //then

        Assertions.assertTrue(result);
    }

    @Test
    public void testIsValid_invalidArguments() {

        //given
        int a = 0;

        //when

        boolean result = calc.isPositive.test(a);

        //then

        Assertions.assertFalse(result);
    }
}
