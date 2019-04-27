

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    private Calculator calculator;

    @Test
    public void addingTwoNumbersShouldReturnExpectedResult() {
        // Given
        calculator = new Calculator();

        // When
        int result = calculator.add(2, 3);

        // Then
        assertEquals(5, result);
    }

    @Test
    public void minusTwoNumbersShouldReturnExpectResult() {
        // Give
        calculator = new Calculator();
        //When
        int result = calculator.minus(3, 2);
        //Then
        assertEquals(1, result);
    }
}


