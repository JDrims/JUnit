import org.junit.jupiter.api.Assertions;
import test.Calculator;

public class MainTest {


    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        final int a = 3;
        final int b = 4;
        final int original = 7;
        Calculator calculator = Calculator.instance.get();

        // when:
        final int result = calculator.plus.apply(a,b);

        // then:
        Assertions.assertEquals(original, result);
    }
}
