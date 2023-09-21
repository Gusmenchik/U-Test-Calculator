import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorMinusTest {

    Calculator calc = Calculator.instance.get();

    @Test

    public void testMinus_validArguments() {

        //given

        int a = 15;

        int b = 0;

        //when

        int result = calc.minus.apply(a, b);

        //then

        Assertions.assertEquals(15, result);

    }

}
