import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorDivideTest {
    Calculator calc = Calculator.instance.get();

    @Test
    public void testDivide_validArguments() {
        //given

        double a = 12;
        double b = 0;

        //when

        double result = calc.divide.apply(a, b);

        //then

        Assertions.assertEquals(0, result);

    }

    @Test
    public void testDivide_invalidArguments() {
        //given

        double a = 12;
        double b = 0;

        //when

        double result = calc.divide.apply(a, b);

        //then

        Assertions.assertEquals(0, result);
    }


}
