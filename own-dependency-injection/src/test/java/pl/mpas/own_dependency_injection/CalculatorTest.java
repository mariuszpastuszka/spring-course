package pl.mpas.own_dependency_injection;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class CalculatorTest {

    @Test
    public void addTest() {
        int expected = 10;

        Calculator calculator = new Calculator();
        calculator.add(4, 6);
        Assert.assertEquals(10, calculator.getResult());
    }

    @Test
    public void addTestWithReflection() {
        int expected = 4 + 6;

        Calculator calculator = new Calculator();
        calculator.add(4, 6);

        try {
            Field field = Calculator.class.getDeclaredField("result");
            field.setAccessible(true);

            int valueFromCalculator = field.getInt(calculator);
            Assert.assertEquals(expected, valueFromCalculator);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
